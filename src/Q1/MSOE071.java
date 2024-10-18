package Q1;

import java.util.Scanner;

public class MSOE071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height 1: ");
        double h1 = sc.nextDouble();
        System.out.print("Length 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Length 2: ");
        double l2 = sc.nextDouble();

        double h2 = l2 * (h1/l1);
        System.out.println("Unknown height: " + h2);
    }
}
