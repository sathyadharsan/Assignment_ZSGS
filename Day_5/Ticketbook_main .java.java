package Ticketbook;

//        4. Design a Java Ticket Booking System using polymorphism where Bus, Train,
//        and Flight tickets share a common method but implement booking differently.
abstract class  Ticket{
    public String passenger_name;


    public Ticket(String name){
        this.passenger_name=name;
    }
    public  abstract void bookTicket();
}

class Bus extends  Ticket{

    public Bus(String name) {
        super(name);
    }

    @Override
    public void bookTicket() {

        System.out.println("passenger_name"+ passenger_name);


        System.out.println("seat is booked in Bus");

    }
}
class Train extends Ticket{

    public Train(String name) {
        super(name);
    }

    @Override
    public void bookTicket() {
        System.out.println("passenger_name"+ passenger_name);


        System.out.println("seat is booked in Train");

    }
}
class Flight extends  Ticket{

    public  Flight(String name){
        super(name);
    }

    @Override
    public void bookTicket() {
        System.out.println("passenger_name"+ passenger_name);


        System.out.println("seat is booked in Flight");

    }
}



public class Ticketbook_main {
    public static void main(String[] args) {

        Ticket t1;
     t1=new Bus("Sathay");
     t1.bookTicket();
    t1= new Train("Anbu");
    t1.bookTicket();
    t1= new Flight("Muthu");

    t1.bookTicket();

    }

}
