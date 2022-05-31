
package ticketbookingsystem;

public class TypeFactory extends AbstractFactory{
        @Override
        public Ticket getTicket(String ticket){
            return null;
        }
    
        @Override
        public Type getType(String ticketType){
        if(ticketType == null)
            return null;
        if(ticketType.equalsIgnoreCase("Silver")){
            return new SilverType();
        }else if(ticketType.equalsIgnoreCase("Gold")){
            return new GoldType();
        }else if(ticketType.equalsIgnoreCase("Platinum")){
            return new PlatinumType();
        }
        return null;
    }
}
