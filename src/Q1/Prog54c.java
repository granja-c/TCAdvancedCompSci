package Q1;
import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double rad = sc.nextDouble();
        double area = Math.PI * Math.pow(rad, 2);
        double circ = Math.PI * rad * 2;
        System.out.printf("Area: %.3f\nCircumference: %.3f", area, circ);

    }
}
/*
Radius: 3.712
Area: 43.288
Circumference: 23.323
Process finished with exit code 0
 */