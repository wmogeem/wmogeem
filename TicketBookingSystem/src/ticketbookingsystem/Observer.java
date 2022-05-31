package ticketbookingsystem;

public abstract class Observer {

    private String recipient;

    public String getRecipient() {
        this.recipient = recipient;
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public abstract void update(String m);
}
