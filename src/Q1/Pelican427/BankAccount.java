package Q1.Pelican427;

public class BankAccount {
    String name;
    double balance;
    public BankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }
    public void deposit(double dp) { balance += dp; }
    public void withdraw(double wd) { balance -= wd; }

}
