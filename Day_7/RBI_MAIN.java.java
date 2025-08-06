package asign7_1;
//*Day-7 Assignment Questions:*
//        1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
//        Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
//        Hint:
//        Class Customer
//        {
////Personal Details ...
//// Few functions ...
//        }
//        Class Account
//        {
//// Account Detail ...
//// Few functions ...
//        }
//        Class RBI
//        {
//        Customer c; //hasA relationship
//        Account a; //hasA relationship
//        ..
//        Public double GetInterestRate() { }
//        Public double GetWithdrawalLimit() { }
//        }
//        Class SBI extends public RBI
//        {
////Use RBI functionality or define own functionality.
//        }
//        Class ICICI extends public RBI
//        {
////Use RBI functionality or define own functionality.
class Account {

    private  int acc_num;
    private  String acc_type;

    public Account(int acc_num, String acc_type) {
        this.acc_num = acc_num;
        this.acc_type = acc_type;
    }

    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }


    public  void displataccount(){
        System.out.println(acc_num);
        System.out.println(acc_type);
    }
}

class Customer {

    private  String holder_name;
    private  int phone_number;

    public Customer(String holder_name, int phone_number) {
        this.holder_name = holder_name;
        this.phone_number = phone_number;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }


    public  void customerdata(){
        System.out.println(holder_name);
        System.out.println(phone_number);
    }
}


abstract class RBI {

    Customer c;
    Account a;

    public RBI(Customer c, Account a) {
        this.c = c;
        this.a = a;
    }

    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();
}


class SBI extends  RBI{


    public SBI(Customer c, Account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 10000;
    }
}

class  ICCI extends  RBI{

    public ICCI(Customer c, Account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 5.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 20000;
    }
}


public class RBI_MAIN {
    public static void main(String[] args) {


        Customer cus= new Customer("sathya",9886257);
        Account acc= new Account(52398624,"savings");


        SBI sbi  =new SBI(cus,acc);
        System.out.println(sbi.getInterestRate());
        System.out.println( sbi.getWithdrawalLimit());
        sbi.a.displataccount();
        sbi.c.customerdata();



    }
}
