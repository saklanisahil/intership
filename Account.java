public class Account {
    private double balance;

    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
