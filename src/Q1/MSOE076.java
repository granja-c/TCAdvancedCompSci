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

    }
}
