package assign7_2;
//. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
//        Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main
//class where you can accept payment using different methods.
public interface payment_gateway_system {

    void paymentMethod(double amount );
}
