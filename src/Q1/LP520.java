package Q1;

import java.util.Scanner;

public class LP520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String vow = "aeiou";
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vow.contains(str.substring(i, i+1))) {
                cnt++;
            }
        }
        System.out.println("Vowels: " + cnt);
    }
}
/*
abceee
Vowels: 4
 */