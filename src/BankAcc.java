public class BankAcc {
    private double balance;
    private String name;

    public BankAcc (double balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    public double deposit(double dep) {
        return balance += dep;
    }
    public double withdrawal(double with) {
        return balance -= with;
    }
    public String total() {
        return name + ", your account balance is: " + balance;
    }
}
