package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class MSOE079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting bin: ");
        int st = sc.nextInt();
        System.out.print("Bin width: ");
        int bw = sc.nextInt();
        System.out.println("Number of numbers: ");
        int n = sc.nextInt();
        var nums = new int[n];
        System.out.println("Numbers: ");
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            nums[n] = x;
            if (x > max) max = x;
        }
        String[] res = new String[max-st+1];
        for (int i = 0; i < n; i++) {
//            if (n >= st && n < st+bw) res[i] += "*";
//            else if (n >= st+bw && n < st+bw*2) res[i] += "*";
//            else if (n >= st+bw*2 && n < st+bw*4) res[i] += "*";
        }
    }
}
