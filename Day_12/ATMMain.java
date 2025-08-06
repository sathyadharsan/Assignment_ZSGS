// ATM class with synchronized methods
class ATM {
    private int balance = 10000;

    public synchronized boolean checkPin(int pin) {
        System.out.println("Checking PIN...");
        if (pin == 1234) {
            System.out.println("? PIN Verified");
            return true;
        } else {
            System.out.println("? Incorrect PIN");
            return false;
        }
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Processing withdrawal...");
        if (amount <= balance) {
            balance -= amount;
            System.out.println("?? Withdrawn: ?" + amount);
        } else {
            System.out.println("? Insufficient Balance!");
        }
    }

    public synchronized void checkBalance() {
        System.out.println("?? Current Balance: ?" + balance);
    }

    public synchronized void printReceipt() {
        System.out.println("?? Printing Receipt...");
        System.out.println("Thanks for using our ATM!");
    }
}
class PinCheckThread extends Thread {
    ATM atm;
    int pin;

    public PinCheckThread(ATM atm, int pin) {
        this.atm = atm;
        this.pin = pin;
    }

    public void run() {
        boolean valid = atm.checkPin(pin);
        if (!valid) {
            System.out.println("?? Exiting due to wrong PIN...");
            System.exit(0); // Exit if pin is wrong
        }
    }
}

class WithdrawThread extends Thread {
    ATM atm;
    int amount;

    public WithdrawThread(ATM atm, int amount) {
        this.atm = atm;
        this.amount = amount;
    }

    public void run() {
        atm.withdraw(amount);
    }
}

class BalanceThread extends Thread {
    ATM atm;

    public BalanceThread(ATM atm) {
        this.atm = atm;
    }

    public void run() {
        atm.checkBalance();
    }
}

class ReceiptThread extends Thread {
    ATM atm;

    public ReceiptThread(ATM atm) {
        this.atm = atm;
    }

    public void run() {
        atm.printReceipt();
    }
}
public class ATMMain {
    public static void main(String[] args) {
        ATM atm = new ATM();

        PinCheckThread pinCheck = new PinCheckThread(atm, 1234); // correct pin
        WithdrawThread withdraw = new WithdrawThread(atm, 3000); // withdraw ?3000
        BalanceThread balance = new BalanceThread(atm);
        ReceiptThread receipt = new ReceiptThread(atm);

        // Run in sequence
        pinCheck.start();
        try { pinCheck.join(); } catch (Exception e) {}

        withdraw.start();
        try { withdraw.join(); } catch (Exception e) {}

        balance.start();
        try { balance.join(); } catch (Exception e) {}

        receipt.start();
    }
}
