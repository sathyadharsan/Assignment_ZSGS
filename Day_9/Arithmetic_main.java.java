package Exception;



//        int quotient = arr[7] / arr[4];
//        Develop a Java program which handles any unexpected situations that may arise during execution.




public class Arithmetic_main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 0, 7};

        try{
            int quotient = arr[7] / arr[4];
            System.out.println(quotient);

        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("arrayIndexOutOfBoundsException caught "+arrayIndexOutOfBoundsException.getMessage());
        }
        catch (ArithmeticException arithmeticException){
            System.out.println( "arithmeticException caught"+ arithmeticException.getMessage()+" not divided by zero");

        }


    }
}
