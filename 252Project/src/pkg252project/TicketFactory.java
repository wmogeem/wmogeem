
package pkg252project;

public class TicketFactory {
    	public Ticket createdTicket(String name){
		Ticket t = null;
		if(name.equalsIgnoreCase("Museum")){
                    t = new Museum();
                }
                else if (name.equalsIgnoreCase("Opera")){
                    t = new Opera();
                }
                else if(name.equalsIgnoreCase("Oceanarium")){
                    t = new Oceanarium();
                }    
                else if (name.equalsIgnoreCase("SportsStadium")){
                    t = new SportsStadium();
                        }
		return t;
	}

}