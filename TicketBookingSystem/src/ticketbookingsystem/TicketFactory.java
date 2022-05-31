
package ticketbookingsystem;

public class TicketFactory extends AbstractFactory{
    @Override
    public Ticket getTicket(String ticket){
        if(ticket == null)
            return null;
        if(ticket.equalsIgnoreCase("Jeddah museum")){
            return new JeddahMuseum();
        }else if(ticket.equalsIgnoreCase("Sports Stadium")) {
            return new SportsStadium();
        }else if(ticket.equalsIgnoreCase("Oceanarium")){
            return new Oceanarium();
        }else if(ticket.equalsIgnoreCase("Opera")){
            return new Opera();
        }
        return null;
    }
    @Override
    Type getType(String ticketType) {
        return null;
    }
    
}
