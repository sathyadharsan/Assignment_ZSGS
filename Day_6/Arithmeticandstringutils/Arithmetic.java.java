package arithemtic;

public class Arithmetic {
    public   int addtion(int a,int b){
        return  a+b;

    }

    public   int subtraction(int a,int b){
        return  a-b;

    }

    public   int multiplication(int a,int b){
        return  a*b;

    }

    public   int division(int a,int b){

        if(b==0){
            throw  new ArithmeticException("division is not allowed b is zero");
        }
        return  a/b;

    }

    public   int modulo(int a,int b){
        if(b==0)
        {
            throw new ArithmeticException("modulo is not allowed b is zeror");
        }
        return  a%b;

    }
}
