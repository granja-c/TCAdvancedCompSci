package Q1;

import java.util.Scanner;

public class LP35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Change in cents: ");
        int chng = sc.nextInt();
        int q = chng / 25;
        chng %= 25;
        int d = chng / 10;
        chng %= 10;
        int n = chng / 5;
        chng %= 5;
        System.out.printf("Minimum number of coins: \nQuarters: %d\nDimes %d\nNickles: %d\nPennies: %d", q, d, n, chng);
    }
}
/*
Change in cents: 212
Minimum number of coins:
Quarters: 8
Dimes 1
Nickles: 0
Pennies: 2
 */