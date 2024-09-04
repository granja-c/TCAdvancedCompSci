package Q1;
import java.util.Scanner;

public class LP510 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Number 2: ");
        int n2 = sc.nextInt();
        while (n2 > 0) {
            int t = n1 % n2;
            n1 = n2;
            n2 = t;
        }
        System.out.println("GCD: " + n1);
    }
}
/*
Number 1: 32
Number 2: 40
GCD: 8
 */