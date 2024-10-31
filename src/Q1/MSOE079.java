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
            nums[i] = x;
            if (x > max) max = x;
        }

        String[] res = new String[max-st+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max; j+=bw) {
                if (nums[i] >= st+j && nums[i] < st+bw) res[j/bw] += "*";
            }
        }

        for (String s:res) {
            System.out.println(s);
        }
    }
}
