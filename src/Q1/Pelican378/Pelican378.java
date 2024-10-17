package Q1.Pelican378;

import java.util.Scanner;

public class Pelican378 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Slope: ");
        double sl = sc.nextDouble();
        System.out.print("Y-intercept: ");
        double yi = sc.nextDouble();
        LinearFunction lf = new LinearFunction(sl, yi);

        System.out.println("Slope: " + lf.getSlope());
        System.out.println("Y-Intercept: " + lf.getYint());
        System.out.println("Root: " + lf.getRoot());
        System.out.print("Enter an X value: ");
        double x = sc.nextDouble();
        System.out.println("Corresponding Y value: " + lf.getYval(x));
        System.out.print("Enter a Y value: ");
        double y = sc.nextDouble();
        System.out.println("Corresponding X value: " + lf.getXval(y));
    }

}
/*
Slope: -3
Y-intercept: 2.5
Slope: -3.0
Y-Intercept: 2.5
Root: 0.8333333333333334
Enter an X value: -4.61
Corresponding Y value: 16.330000000000002
Enter a Y value: 5
Corresponding X value: -0.8333333333333334

 */