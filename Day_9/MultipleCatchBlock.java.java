package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
//
//2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers,
//        and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException,
//        ArithmeticException and Exception.

public class MultipleCatchBlock {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

       try {
           System.out.println("enter the firest num");
           int num1= sc.nextInt();
           sc.nextLine();
           System.out.println("enter the second number");
           String second=sc.nextLine();


        int num2=Integer.parseInt(second);

           int c=num1/num2;
           System.out.println( "first number divided by second number     "+c);
       }
       catch (InputMismatchException inputMismatchException){
           System.out.println(" InputMismatchException caught"+inputMismatchException.getMessage());
       }
       catch (ArithmeticException arithmeticException){
           System.out.println("ArithmeticException caught"+arithmeticException.getMessage());
       }
       catch (NumberFormatException numberFormatException){
           System.out.println("NumberFormatException caught"+numberFormatException.getMessage());
       }
       catch (Exception e){
           System.out.println("Exception"+e.getMessage());
       }
       finally {
           System.out.println("Always executed");
       }

    }
}
