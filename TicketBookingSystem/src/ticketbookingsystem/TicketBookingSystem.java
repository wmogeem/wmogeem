package ticketbookingsystem;

import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) {

        AbstractFactory TicketFactory = FactoryProducer.getFactory("Ticket");
        Ticket JeddahMusuem = TicketFactory.getTicket("Jeddah Museum");
        Ticket SportsStadium = TicketFactory.getTicket("Sports Stadium");
        Ticket Oceanarium = TicketFactory.getTicket("Oceanarium");
        Ticket Opera = TicketFactory.getTicket("Opera");
        //   ticket1.printTicket();

        AbstractFactory TypeFactory = FactoryProducer.getFactory("Type");
        Type Silver = TypeFactory.getType("Silver");
        Type Gold = TypeFactory.getType("Gold");
        Type Platinum = TypeFactory.getType("Platinum");
        //       type1.print();

        Scanner in = new Scanner(System.in);
        System.out.print("Please choose what event you want to visit \r\nPress (1) for: Jeddah Museum\r\nPress (2) for: Sports Stadium\r\nPress (3) for: Oceanarium\r\nPress (4) for: Opera\r\n\r\n");
        System.out.print("Your choice: ");

        String ticket = in.nextLine();
        String type = "";

        
        while (true) {
            if (ticket.equalsIgnoreCase("1")) {
                JeddahMusuem.printTicket();

                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nYour choice: ");
                while (true) {
                    type = in.nextLine();
                    if (type.equalsIgnoreCase("1")) {
                        Silver.print();
                        break;
                    } else if (type.equalsIgnoreCase("2")) {
                        Gold.print();
                        break;
                    } else if (type.equalsIgnoreCase("3")) {
                        Platinum.print();
                        break;
                    } else {
                        System.out.print("Sorry something wrong just happened, please try again\r\n\r\nYour choice: ");
                        continue;
                    }

                }
                break;
            } else if (ticket.equalsIgnoreCase("2")) {
                SportsStadium.printTicket();
                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nYour choice: ");
                
                while (true) {
                    type = in.nextLine();
                    if (type.equalsIgnoreCase("1")) {
                        Silver.print();
                        break;
                    } else if (type.equalsIgnoreCase("2")) {
                        Gold.print();
                        break;
                    } else if (type.equalsIgnoreCase("3")) {
                        Platinum.print();
                        break;
                    } else {
                        System.out.print("Sorry something wrong just happened, please try again\r\n\r\nYour choice: ");
                        continue;
                    }

                }
                break;
            } else if (ticket.equalsIgnoreCase("3")) {
                Oceanarium.printTicket();
                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nYour choice: ");
                
                while (true) {
                    type = in.nextLine();
                    if (type.equalsIgnoreCase("1")) {
                        Silver.print();
                        break;
                    } else if (type.equalsIgnoreCase("2")) {
                        Gold.print();
                        break;
                    } else if (type.equalsIgnoreCase("3")) {
                        Platinum.print();
                        break;
                    } else {
                        System.out.print("Sorry something wrong just happened, please try again\r\n\r\nYour choice: ");
                        continue;
                    }

                }
                break;
            } else if (ticket.equalsIgnoreCase("4")) {
                Opera.printTicket();
                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nYour choice: ");

                while (true) {
                    type = in.nextLine();
                    if (type.equalsIgnoreCase("1")) {
                        Silver.print();
                        break;
                    } else if (type.equalsIgnoreCase("2")) {
                        Gold.print();
                        break;
                    } else if (type.equalsIgnoreCase("3")) {
                        Platinum.print();
                        break;
                    } else {
                        System.out.print("Sorry something wrong just happened, please try again\r\n\r\nYour choice: ");
                        continue;
                    }

                }
                break;
            } else {
                System.out.print("Sorry something wrong just happened, please try again\r\n\r\nYour choice: ");
                ticket = in.nextLine();
            }
        }

    }
}
