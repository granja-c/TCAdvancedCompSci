package Q1;
import java.util.*;

public class Prog52a {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Length: ");
        var len = sc.nextInt();
        System.out.print("Width: ");
        var wid = sc.nextInt();
        var area = len * wid;
        var perim = wid * 2 + len * 2;
        System.out.printf("Area: %d\nPerimeter: %d", area, perim);
    }
}
/*
Length: 2
Width: 5
Area: 10
Perimeter: 14
Process finished with exit code 0
 */