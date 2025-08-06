package exception;

//4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number.
//        Handle it using try-catch.
public class ParseStringException {
    public static void main(String[] args) {

     try {

         String s="sathya";//String s is pass catch the number format exception
         int n=10;  /// poss n no exception
      int num   =parseStringmethods(s);

         System.out.println(num);
     }catch (NumberFormatException numberFormatException){
         System.out.println("numberFormatException"+ numberFormatException.getMessage() +"this is invalid number");

     }



    }

    static int parseStringmethods(String s){

      return  Integer.parseInt(s);

    }
}
