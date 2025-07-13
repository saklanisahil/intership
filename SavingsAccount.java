abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();
}

public class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest: " + interest);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10000);
        sa.calculateInterest();
    }
}
