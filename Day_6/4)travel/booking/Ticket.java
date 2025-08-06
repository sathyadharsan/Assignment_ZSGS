package travel.booking;

public class Ticket {

    private  int ticket_ID;
    private  String destination;
    private  int fare;

    public Ticket(int ticket_id, String destination, int fare) {
        this.ticket_ID=ticket_id;
        this.destination=destination;
        this.fare=fare;
    }

    public  void displyticket(){
        System.out.println(ticket_ID);
        System.out.println(destination);
        System.out.println(fare);
    }

}
