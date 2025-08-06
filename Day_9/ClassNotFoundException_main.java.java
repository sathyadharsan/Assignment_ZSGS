package exception;


//3. Write a program to illustrate how to throw a ClassNotFoundException.



public class ClassNotFoundException_main {

    public static void main(String[] args) {
        try {
            loadbyvalue();

        }
        catch (ClassNotFoundException classNotFoundException){
            System.out.println( "classNotFoundException caught "+classNotFoundException.getMessage());
        }

    }
    static  void loadbyvalue() throws ClassNotFoundException {
        throw  new ClassNotFoundException("my class is not found");
    }


}
