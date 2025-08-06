package exception;
//        7. Write a Java program that shows exception propagation across multiple methods
//        (method1 calls method2 calls method3,
//        which throws the exception). Handle the exception in method1.

public class Methodsrecursionexceptionexception {
    public static void main(String[] args) {

        try{
            method1();

        }
        catch (ArithmeticException arithmeticException){
            System.out.println("arithmeticException caught"+ arithmeticException.getMessage());
        }

    }
    static  void method1(){
        method2();
    }
    static  void  method2(){
        methods3();
    }

     static void methods3() {

        int c=10/0;
    }
}
