
package lab8observer;

public class EmailObserver extends Observer {
        public EmailObserver(String recipient){
        super.setRecipient(recipient);   
    }

    @Override
    public void update(String m) {
        System.out.println("Email Observer :: @" + getRecipient() + " " + m);
    }
}
