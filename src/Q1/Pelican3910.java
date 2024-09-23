package Q1;
import java.io.*;
import java.util.*;

class ModFib {
    public static int modFibonacci(int n) {
        if (n == 0) return 3;
        else if (n == 1) return 5;
        else if (n == 2) return 8;
        else return modFibonacci(n-1) + modFibonacci(n-2) + modFibonacci(n-3);

    }
}
public class Pelican3910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Generate which term number? ");
        int k = sc.nextInt();

        System.out.println("Term #" + k + " is " + ModFib.modFibonacci(k));
    }
}
/*
Generate which term number? 5
Term #5 is 53
 */