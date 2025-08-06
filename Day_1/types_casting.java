public class type_casting{
    public static void main(String[] args) {
        double doubleVal = 100.99;
        int intVal = (int) doubleVal; // Explicit casting

        System.out.println("Original double: " + doubleVal);
        System.out.println("After casting to int: " + intVal);
    }
}
