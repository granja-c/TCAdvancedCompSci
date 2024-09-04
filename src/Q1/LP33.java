package Q1;

import java.util.Scanner;

public class LP33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rent: ");
        double rent = sc.nextDouble();
        System.out.print("Tuition: ");
        double tuit = sc.nextDouble();
        System.out.print("Books: ");
        double book = sc.nextDouble();
        System.out.print("Supplies: ");
        double supply = sc.nextDouble();
        System.out.print("Scholarship: ");
        double scsh = sc.nextDouble();
        double tot = rent + tuit + book + supply - scsh;
        System.out.println("Total cost: " + tot);
    }
}
/*
Rent: 10000
Tuition: 20000
Books: 1000
Supplies: 200
Scholarship: 10000
Total cost: 21200.0
 */