package Assignment6;

//*Day-6 Assignment Questions:*
//        1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data
//        members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide
//        appropriate public getter and setter methods to access and modify these details securely. Also include a method to
//        display the transaction summary.]

 class Payment_Gateway_System{

    private int transaction_ID;
    private String payer_name;
    private String payee_name;
    private double amount;
    private String payment_method;
    private String transaction_status;
    private String provide;

    public Payment_Gateway_System(int transaction_ID, String payer_name, String payee_name,
                                  double amount, String payment_method, String transaction_status,
                                  String provide) {
        this.transaction_ID = transaction_ID;
        this.payer_name = payer_name;
        this.payee_name = payee_name;
        this.amount = amount;
        this.payment_method = payment_method;
        this.transaction_status = transaction_status;
        this.provide = provide;
    }

    public int getTransaction_ID() {
        return transaction_ID;
    }

    public void setTransaction_ID(int transaction_ID) {
        this.transaction_ID = transaction_ID;
    }

    public String getPayer_name() {
        return payer_name;
    }

    public void setPayer_name(String payer_name) {
        this.payer_name = payer_name;
    }

    public String getPayee_name() {
        return payee_name;
    }

    public void setPayee_name(String payee_name) {
        this.payee_name = payee_name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getTransaction_status() {
        return transaction_status;
    }

    public void setTransaction_status(String transaction_status) {
        this.transaction_status = transaction_status;
    }

    public String getProvide() {
        return provide;
    }

    public void setProvide(String provide) {
        this.provide = provide;
    }

     @Override
     public String toString() {
         return "Payment_Gateway_System{" +
                 "transaction_ID=" + transaction_ID +
                 ", payer_name='" + payer_name + '\'' +
                 ", payee_name='" + payee_name + '\'' +
                 ", amount=" + amount +
                 ", payment_method='" + payment_method + '\'' +
                 ", transaction_status='" + transaction_status + '\'' +
                 ", provide='" + provide + '\'' +
                 '}';
     }
 }
     class Payment_Gateway_System_main {
         public static void main(String[] args) {



          Payment_Gateway_System  paymentGatewaySystem  =  new Payment_Gateway_System(1,
                  "sathya","flipkart",
                  1000.0,"Credit_card     ","Successful","paypal");
             System.out.println("Transaction_ID      "+paymentGatewaySystem.getTransaction_ID());
             System.out.println("Payer_name     " +paymentGatewaySystem.getPayer_name());
             System.out.println("Payee_name    "+paymentGatewaySystem.getPayee_name());
             System.out.println("Amount    "+paymentGatewaySystem.getAmount());
             System.out.println("Payment_method    "+paymentGatewaySystem.getPayment_method());
             System.out.println("Transaction_status   "+paymentGatewaySystem.getTransaction_status());
             System.out.println("Provide     "+paymentGatewaySystem.getProvide());


         }


     }




