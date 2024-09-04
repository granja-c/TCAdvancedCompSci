package Q1;

import java.util.Scanner;

public class LP519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String srch = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + srch.length()).equals(srch)) {

            }
        }
    }
}
