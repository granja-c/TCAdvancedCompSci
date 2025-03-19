package Q3;

import java.util.Scanner;

public class MSOE102 {
    public static boolean containsTC(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        if (containsTC(word)) {
            System.out.println("It does contain a triple character");
        } else System.out.println("It does not contain a triple character");
    }
}
