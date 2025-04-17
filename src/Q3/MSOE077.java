package Q3;

import java.util.Scanner;


public class MSOE077 {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(0);
        }
        int d = 0;
        while (!isPalindrome(n)) {
            d++;
            n++;
        }
        System.out.println(d);
    }
}
