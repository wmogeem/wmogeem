
package lab8observer;

public class FacebookObserver extends Observer{
        public FacebookObserver(String recipient){
        super.setRecipient(recipient);   
    }

    @Override
    public void update(String m) {
        System.out.println("Facebook Observer :: @" + getRecipient() + " " + m);
    }
    
}
