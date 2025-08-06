package assign_7_4;

//evelop a Java application for a Ticket Booking System that allows users to book tickets for different types of
//        transportation modes such as Bus, Train, and Flight.
//        Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must
//        implement differently.
//        Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
//        Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface



class  Bus implements  Ticket_Booking_System{

    @Override
    public void bookTicket() {
        System.out.println("Bus ticket booked");

    }
}

class Train implements  Ticket_Booking_System{

    @Override
    public void bookTicket() {
        System.out.println("Train ticket is booked");

    }
}

class  Fligt implements  Ticket_Booking_System{

    @Override
    public void bookTicket() {
        System.out.println("Flight ticket is booked");
    }
}

class Booking_Office{
    private Ticket_Booking_System ticket_booking_system;

    public Booking_Office(Ticket_Booking_System ticket_booking_system) {
        this.ticket_booking_system = ticket_booking_system;
    }
    public  void  book(){
        ticket_booking_system.bookTicket();
    }
}

public  class Ticket_Booking_System_Main {

    public static void main(String[] args) {
         Ticket_Booking_System ref= new Bus();

   Booking_Office book =new      Booking_Office(ref);
   book.book();

    }
}
