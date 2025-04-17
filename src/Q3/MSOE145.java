package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class MSOE145 {
    public static void main(String[] args) {
        var facs = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int x = sc.nextInt();
        int fac = 2;
        while (Math.pow(fac, 2) < x) {
            if (x % fac == 0) {
                facs.add(fac);
                x /= fac;
            } else ++fac;
        }
        if (Math.pow(fac, 2) == x) {
            facs.add(fac);
            facs.add(fac);
        } else facs.add(x);

        int f = -1;
        int res = 1;
        for (int i:facs) {
            if (i==f) res *= f;
            else f = i;
        }
        System.out.print(res);
    }
}
