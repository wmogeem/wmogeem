
package lab8observer;

public class WhatsappObserver extends Observer{
        public WhatsappObserver(String recipient){
        super.setRecipient(recipient);   
    }

    @Override
    public void update(String m) {
        System.out.println("Whatsapp Observer :: @" + getRecipient() + " " + m);
    }
}
