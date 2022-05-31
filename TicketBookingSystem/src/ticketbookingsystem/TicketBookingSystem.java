package ticketbookingsystem;

import java.io.*;
import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        String type = "";
        Boolean b = true;
        
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

        System.out.print("=========Welcome to Ticket Booking System=========\r\n\r\nPlease type your email: ");
        String email = in.nextLine();
        Observer emailObserver = new EmailObserver(email);
        Subject s = new MessageSubject();

        System.out.print("\r\nPlease choose what event you want to visit \r\nPress (1) for: Jeddah Museum\r\nPress (2) for: Sports Stadium\r\nPress (3) for: Oceanarium\r\nPress (4) for: Opera\r\n\r\nYour choice: ");
        String ticket = in.nextLine();

        while (true) {
            if (ticket.equalsIgnoreCase("1")) {
                JeddahMusuem.printTicket();
                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nPress (y) to recieve notifications when there are discounts available\r\n\r\nYour choice: ");
                while (b != false) {
                    type = in.nextLine();
                    choiceTicketType(Silver, Gold, Platinum, type, b, s, emailObserver);
                }
            } else if (ticket.equalsIgnoreCase("2")) {
                SportsStadium.printTicket();
                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nPress (y) to recieve notifications when there are discounts available\r\n\r\nYour choice: ");
                while (b != false) {
                    type = in.nextLine();
                    choiceTicketType(Silver, Gold, Platinum, type, b, s, emailObserver);
                }
            } else if (ticket.equalsIgnoreCase("3")) {
                Oceanarium.printTicket();
                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nPress (y) to recieve notifications when there are discounts available\r\n\r\nYour choice: ");
                while (b != false) {
                    type = in.nextLine();
                    choiceTicketType(Silver, Gold, Platinum, type, b, s, emailObserver);
                }
            } else if (ticket.equalsIgnoreCase("4")) {
                Opera.printTicket();
                System.out.print("\r\nPlease choose what type of ticket you want to purchase\r\nPress (1) for: Silver ticket\r\nPress (2) for: Gold ticket\r\nPress (3) for: Platinum ticket\r\n\r\nPress (y) to recieve notifications when there are discounts available\r\n\r\nYour choice: ");
                while (b != false) {
                    type = in.nextLine();
                    choiceTicketType(Silver, Gold, Platinum, type, b, s, emailObserver);
                }
            } else {
                System.out.print("Sorry something wrong just happened, please try again\r\n\r\nYour choice: ");
                ticket = in.nextLine();
            }
        }
    }

    private static Boolean choiceTicketType(Type Silver, Type Gold, Type Platinum, String type, Boolean b, Subject s, Observer emailObserver) throws InterruptedException {

        if (type.equalsIgnoreCase("1")) {
            Silver.print();
            System.out.println("\r\n\"A notifcation will be sent in 2 seconds\"");
            Thread.sleep(2500);
            s.notifyUpdate("Purchase one ticket and get the other for free !");
            System.exit(0);
        } else if (type.equalsIgnoreCase("2")) {
            Gold.print();
            System.out.println("\r\n\"A notifcation will be sent in 2 seconds\"");
            Thread.sleep(2500);
            s.notifyUpdate("Purchase one ticket and get the other for free !");
            System.exit(0);
        } else if (type.equalsIgnoreCase("3")) {
            Platinum.print();
            System.out.println("\r\n\"A notifcation will be sent in 2 seconds\"");
            Thread.sleep(2500);
            s.notifyUpdate("Purchase one ticket and get the other for free !");
            System.exit(0);
        } else if (type.equalsIgnoreCase("y")) {
            s.subscribe(emailObserver);
            System.out.print("\r\n*****Thank you for subscribing.*****\r\n\r\nYour choice: ");
        } else {
            System.out.print("Sorry something wrong just happened, please try again\r\n\r\nYour choice: ");
            b = false;
        }
        return b;
    }

}
