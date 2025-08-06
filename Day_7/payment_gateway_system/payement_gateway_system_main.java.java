package assign7_2;


//        2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
//
//        Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment.
//        Write a main class where you can accept payment using different methods.

class CreditCardPayment implements payment_gateway_system{

    @Override
    public void paymentMethod(double amount) {
        System.out.println(" Amount paid use CreditCardPayment " +amount);

    }
}

class DebitCardPayment implements payment_gateway_system{

    @Override
    public void paymentMethod(double amount) {
        System.out.println("amount is paid use  debitcardpayment" +amount);

    }
}


class UPIPayment implements  payment_gateway_system{

    @Override
    public void paymentMethod(double amount) {
        System.out.println("amount is paid use UPI_payment"+amount);

    }
}

class  pyapalsyste implements payment_gateway_system{
    @Override
    public void paymentMethod(double amount) {

    }
}

class Mobile{
    private  payment_gateway_system payment_gateway_system;

    public Mobile(payment_gateway_system payment_gateway_system){
        this.payment_gateway_system= payment_gateway_system;
    }

    public  void  callPayment_gateway_system(double amount){
        payment_gateway_system.paymentMethod(amount);
    }

}


public class payement_gateway_system_main {


    public static void main(String[] args) {
       payment_gateway_system creditCardPayment   =new DebitCardPayment();
     Mobile mobile  = new Mobile(creditCardPayment);
     mobile.callPayment_gateway_system(2000);

    }
}
