package exception;
////5. Create a program where try block contains a return statement. Ensure that finally block executes before the method
//// returns. Show this with output.
//?



public class TryBlockwith_return {

    public static void main(String[] args) {

     int num =  methodcall();

        System.out.println(num);

    }
    static  int methodcall(){
        try{
            System.out.println("i m try block");
            return 1000;
        }
        finally {
            System.out.println("finally block Always executed");
           // return 2000;
        }

    }
}
