package Q1;
import java.lang.Math;
import java.util.Scanner;

public class MSOE076 {
    public static double f(double x){
        return Math.exp(-x*x/2)/Math.sqrt(2*Math.PI);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("n: ");
        double n = sc.nextDouble();
        double area = 0;
        double z = f(a);
        double h = (b-a)/n;
        for (int i = 1; i < n; i++) {
            z += 2 * f(a + i*h);
        }
        area = h/2 * z;
        System.out.println("Area: " + area);
    }
}
/*
a: -1
b: 2
n: 10394872
Area: 0.8185946063294274
 */