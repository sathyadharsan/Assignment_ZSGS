package assign;


import java.util.Scanner;


//3. A class Point is declared as follows:
//class Point{
//    public:
//    Point(){int=0;int=0;} //default constructor
//    void setPoint(int,int); //set coordinates
//    int getX() const {return x;} //get x coordinates
//    int getY() const {return y;} //get y coordinates
//    void printPoint(); // print (x,y) coordinates
//    private int x;
//    private int y;
//};
//Write the implementation of the class Point in the same file.
//        Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(),
//        getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center
//        of the circle. The class Circle also checks to make sure the radius value
//        is a positive number, otherwise it is set to default value 1.
//        Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
//        Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
//        Enter x: 2
//        Enter y: 2
//        Enter radius: 1
//        Circle center is (2,2)
//        Radius is 1
//        Area is 3.14

class  Pointer{
   private int x;
   private int y;

   public  Pointer(){
       System.out.println("no args constructor");
       this.x=0;
       this.y=0;
   }

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setXandsetY(int x ,int y) {
        this.x = x;
        this.y= y;
    }

    public int getY() {
        return y;
    }


    public  void showpointerdata(){
       System.out.println(   "X -" +x +"    "+"Y -"+" "+y);

    }




}
class  Circle extends  Pointer{
    private  int radius;


    public  Circle(){
        System.out.println("no args constructor from circle ");
        this.radius=1;
    }

    public Circle(int x, int y,int z) {
        super(x, y);
        this.radius=z;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
      if(radius>0) {
          this.radius=radius;
      }
      else{
          this.radius=1;
      }
    }
    public  double area(){
        return Math.PI*Math.pow(radius,2);
    }

}
public class Radius_Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     Circle circle = new Circle();

     System.out.println("enter the first pointer");
        int x=sc.nextInt();

        System.out.println("enter the second pointer");
        int y= sc.nextInt();
        circle.setXandsetY(x,y);

System.out.println("enter the radius");
        int z=sc.nextInt();
        circle.setRadius(z);

        double result =circle.area();
        System.out.println(result);

        System.out.println(circle.getX()  +"    "+circle.getY());
        circle.showpointerdata();




    }
}
