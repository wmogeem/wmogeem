package edu.kau.fcit.cpit252.transactions;

import edu.kau.fcit.cpit252.utils.MissingRequiredPropertiesException;
import edu.kau.fcit.cpit252.utils.SendEmail;
import edu.kau.fcit.cpit252.utils.TOTP;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.PassiveExpiringMap;


public abstract class Transaction {
    private final int timeToLiveMinutes = 8;
    private final PassiveExpiringMap<String, String> cacheRegistry = new PassiveExpiringMap(TimeUnit.MINUTES.toMillis(timeToLiveMinutes));

    
    public  boolean executeProtectedTransaction(User user) {
        // 1. send a one-time-password (OTP)
        sendOTP(user.getEmail());
        // 2. validate the OTP
        if(validateOTP(user.getEmail())) {
            // 3. Show a confirmation dialog
            if(showDialog()) {
                // 4. Perform/execute the transaction
                boolean result = perform(user);
                // 5. Show the close dialog
                closeDialog();
                // 6. Return the status of executing the transaction
                return result;
            }
        }    
        return false;
    }

    // Template method for executed non-protected transactions
    public  boolean executeTransaction(User user) {
        // 1. Show a confirmation dialog
        showDialog();
            // 2. Perform/execute the transaction
            boolean result = perform(user);
            // 3. Show the close dialog
            closeDialog();
            // 4. Return the status of executing the transaction
            return result;
    }

    // Hooks
    public abstract boolean showDialog();
    public abstract boolean perform(User u);
    public abstract void closeDialog();

    // Simulate network latency
    protected void simulateNetworkLatency() {
        try {
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private boolean sendOTP(String email) {
        try {
            System.out.println("Generating OTP and sending it to " + email + " ....");
            String otp = TOTP.generateTOTP(timeToLiveMinutes);
            cacheRegistry.put(email, otp);
            SendEmail.send("Your OTP", "Password: " + otp, email);
            return true;
        } catch (NoSuchAlgorithmException | InvalidKeyException | MissingRequiredPropertiesException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean validateOTP(String email) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OTP that was sent to: " + email);
        String enteredPassword = scanner.nextLine().trim();
        String cachedPassword = cacheRegistry.get(email);
        if (cachedPassword!= null && cachedPassword.equals(enteredPassword)) {
            System.out.println("OTP password is matched");
            return true;
        }
        System.out.println("OTP password is invalid");
        return false;
    }

}
