package Q1.Pelican427;
import java.util.*;
import java.text.*;

public class Pelican427 {
    public static void main(String[] args) {
        NumberFormat form = new DecimalFormat("$#,###.##");
        List<BankAccount> accs = new ArrayList<BankAccount>();
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

        BankAccount max = accs.get(0);
        double most = max.balance;
        String richest = max.name;
        for (int i = 1; i < accs.size(); i++) {
            if (accs.get(i).balance > most) {
                max = accs.get(i);
                most = max.balance;
                richest = max.name;
            }
        }
        System.out.println("The account with the largest balance belongs to " + richest + " with a balance of ");
        System.out.println(form.format(most));
    }
}
/*
Name:
camila g
Deposit:
24507356
Name:
mila m
Deposit:
23
Name:
exit
The account with the largest balance belongs to camila g with a balance of
$24,507,356

 */