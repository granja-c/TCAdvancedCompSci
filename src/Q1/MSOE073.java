package Q1;

import java.util.Scanner;

public class MSOE073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("c: ");
        double c = sc.nextDouble();
        System.out.print("A: ");
        double A = Math.toRadians(sc.nextDouble());
        System.out.print("B: ");
        double B = Math.toRadians(sc.nextDouble());
        System.out.print("C: ");
        double C = Math.toRadians(sc.nextDouble());
        if (A+B+C != 180) System.out.println("Enter different angles.");
        else {
            double r = c * Math.sin((A/2)) * Math.sin((B/2)) * (1 / Math.cos(C));
            System.out.println("r: " + r);
        }


    }
}
