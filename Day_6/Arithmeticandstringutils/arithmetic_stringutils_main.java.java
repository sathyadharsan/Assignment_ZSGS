package arithmetic_stringutils;
//2. Create a Java application that demonstrates the use of user-defined packages by organising classes based
//        on their functionality:
//        --- arithmetic: This package should include a class that defines methods to perform the following operations
//        on two numbers:
//        a. Addition
//        b. Subtraction
//        c. Multiplication
//        d. Division
//        e. Modulo
//        --- stringutils: This package should include a class that defines methods for:
//        a. Concatenating two strings
//        b. Reversing a string
//        c. Finding the length of a string
//        In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.
//


        import arithemtic.Arithmetic;
import stringutils.stringutils_class;


public class arithmetic_stringutils_main {
    public static void main(String[] args) {
   Arithmetic arithmetic=      new Arithmetic();
   System.out.println(arithmetic.addtion(5,10));
 System.out.println(  arithmetic.subtraction(5,10));
 System.out.println(arithmetic.division(5,10));
 System.out.println(arithmetic.modulo(5,10));
 System.out.println(arithmetic.multiplication(5,10));


        stringutils_class stringutils_class= new stringutils_class();

        System.out.println(stringutils_class.concatenation("Hello","world"));
        System.out.println(stringutils_class.reverseStrig("sathya"));
        System.out.println(stringutils_class.lengthofString("sathya"));

    }
}
