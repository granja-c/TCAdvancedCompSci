package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        if (quantity <= 99) {
            System.out.println("Price: $5.95\n" + quantity * 5.95 + " ");
        } else if (quantity <= 199) {
            System.out.println("Price: $5.75\n" + quantity * 5.75 + " ");
        } else if (quantity <= 299) {
            System.out.println("Price: $5.40\n" + quantity * 5.40 + " ");
        } else {
            System.out.println("Price: $5.15\n" + quantity * 5.15 + " ");
        }
    }
}
