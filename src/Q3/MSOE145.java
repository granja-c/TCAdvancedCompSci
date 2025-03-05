package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class MSOE145 {
    public static void main(String[] args) {
        var facs = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int x = num;
        int fac = 2;
        while (Math.pow(fac, 2) < x) {
            if (x % fac == 0) {
                facs.add(fac);
            }
        }
    }
}
