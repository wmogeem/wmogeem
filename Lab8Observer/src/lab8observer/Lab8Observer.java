
package lab8observer;

public class Lab8Observer {

    public static void main(String[] args) {
        Observer twObserver = new TwitterObserver("CPIT_252_price_watcher");
        Observer fbObserver = new FacebookObserver("CPIT_252_price_watcher");
        Observer emailObserver = new EmailObserver("amogeem0003@stu.kau.edu.sa");
        Observer waObserver = new WhatsappObserver("966 555 - 994 - 495");
        
        Subject s = new MessageSubject();
        s.subscribe(twObserver);
        s.subscribe(fbObserver);
        s.subscribe(emailObserver);
        
        s.notifyUpdate("The price has dropped from SAR 299.99 to SAR 249.99.");
        
        System.out.println("\nChange observers: unsubscribed email and subscribed Whatsapp\n");
        s.unsubscribe(emailObserver);
        s.subscribe(waObserver);
        
        s.notifyUpdate("The price has dropped from SAR 249.99 to SAR 199.99.");
    }   
    
    
}
