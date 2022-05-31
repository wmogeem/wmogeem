
package ticketbookingsystem;

public class FactoryProducer {
    static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Ticket")){
            return new TicketFactory();
        }else if(choice.equalsIgnoreCase("Type")){
            return new TypeFactory();
        }
        return null;
    }

}
