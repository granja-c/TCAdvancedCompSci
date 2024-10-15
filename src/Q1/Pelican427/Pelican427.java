package Q1.Pelican427;
import java.util.*;
import java.text.*;

public class Pelican427 {
    public static void main(String[] args) {
        NumberFormat form = new NumberFormat.getNumberInstance();
        List<BankAccount> accs = new ArrayList<BankAccount>();
        form.setMinimumFractionDigits(2);
        form.setMaximumFractionDigits(2);
        String name;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Name: ");
            name = sc.nextLine();
            if(!name.equalsIgnoreCase("EXIT")) {
                System.out.println("Deposit: ");
                double bal = sc.nextDouble();
                accs.add(new BankAccount(name, bal));
            }
        } while (!name.equalsIgnoreCase("EXIT"));
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < accs.size(); i++) {

        }
    }
}
