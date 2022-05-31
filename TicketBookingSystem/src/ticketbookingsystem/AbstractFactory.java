
package ticketbookingsystem;

public abstract class AbstractFactory {
    abstract Ticket getTicket(String t);
    abstract Type getType(String t);
}
