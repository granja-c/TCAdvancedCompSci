package Q1;
import Utils.Console;

public class LP313 {
    public static void main(String[] args) {
        double princ = Console.input("Principal: ");
        int yrs = Console.input("Years: ");
        double rate = Console.input("Interest Rate: ");
        double amt = princ * (1 + yrs * rate);
        System.out.printf("The value after the term: $%.2f\n", amt);
        double des = Console.input("Desired amount: ");
        double pr = des / (1 + yrs * rate);
        System.out.printf("Principal: %.2f", pr);
    }
}
/*
Principal: 5000.
Years: 5
Interest Rate: .06
The value after the term: $6500.00
Desired amount: 6500.
Principal: 5000.00
 */