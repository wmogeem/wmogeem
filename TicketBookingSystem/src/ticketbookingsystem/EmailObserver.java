
package ticketbookingsystem;

public class EmailObserver extends Observer{
        public EmailObserver(String recipient){
        super.setRecipient(recipient);   
    }
        
    @Override
    public void update(String m) {
        System.out.println("\r\nEmail notification to: " + getRecipient() + "\r\n" + m);
    }
}
