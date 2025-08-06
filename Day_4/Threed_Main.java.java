package assign;
//2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is
//        derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
//        sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
//        In main:
//        Create one ThreeD object using the default constructor.
//        Use the setters to set x, y, and z.
//        Create the second ThreeD object using the constructor with three arguments.
//        in the TwoD class:
//        Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
//        Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"

class TwoD{
    int x;
    int y;

    public  TwoD(){
        System.out.println("default constructor");
        this.x=0;
        this.y=0;

    }

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ThreeD extends  TwoD{
    int z;

    public  ThreeD(){
        System.out.println("no args constructor");
        this.z=0;
    }

    public ThreeD(int x,int y,int z) {
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public  double distanceTo(ThreeD other){
        int dx= other.x-this.x;
        int dy=other.y-this.y;
        int dz=other.z-this.z;
        return  Math.sqrt(dx*dx +dy*dy +dz*dz);
    }
}
public class Threed_Main {
    public static void main(String[] args) {


       ThreeD threeD1= new ThreeD();
       threeD1.setX(1);
       threeD1.setY(2);
       threeD1.setZ(3);

        ThreeD threeD2 =new ThreeD(4,6,8);
       double distance =  threeD1.distanceTo(threeD2);
        System.out.println(distance);

        System.out.println(threeD1.x+" "+threeD1.y+" "+threeD1.z);
        System.out.println(threeD2.x+" "+threeD2.y+" "+ threeD2.z);



    }
}
