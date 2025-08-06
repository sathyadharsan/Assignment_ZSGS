package travel.user;


import travel.booking.Ticket;

//4. Design a travel booking system using two packages:
//        `travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
//        `travel.user` – includes a class `User` with user details and a method to book a ticket.
//        Illustrate accessing ticket data from within the user class.

class user {
    private  int user_ID;
    private  String user_name;
    private  int  user_age;




    public  user(int  user_ID,String user_name,int user_age){
this.user_ID =user_ID;
this.user_name=user_name;
this.user_age=user_age;
    }


    public  void book_ticket(int ticket_ID,String destination,int fare){
      Ticket ticket =  new Ticket(ticket_ID,destination,fare);
        System.out.println("user_id"+user_ID);
        System.out.println("user_name"+user_name);
        System.out.println("user_age"+user_age);

        ticket.displyticket();


    }





}

public class User_main{
    public static void main(String[] args) {
        user user = new user(1,"sathya",25);
        user.book_ticket(101,"Chennai",500);




    }
}
