package assign;


//
//4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.

class  Father{

    public void doStudy(){
        System.out.println("father said to well study for exam");
    }

}
class  Mother{
    public void doStudy(){
        System.out.println("mother said to well study for exam");
    }

}

public class Multipleinheritence extends Father,Mother{
//        extends  Father,Mother {
    public static void main(String[] args) {
     Multipleinheritence m1 =  new Multipleinheritence();
//     m1.doStudy1();
    }

}
