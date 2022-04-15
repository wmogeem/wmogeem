
package lab8observer;

public class TwitterObserver extends Observer {
    public TwitterObserver(String recipient){
        super.setRecipient(recipient);   
    }

    @Override
    public void update(String m) {
        System.out.println("Twitter Observer :: @" + getRecipient() + " " + m);
    }
}
