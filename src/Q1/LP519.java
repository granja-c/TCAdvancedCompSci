package Q1;

import java.util.Scanner;

public class LP519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sentence: ");
        String str = sc.nextLine();
        System.out.print("Word to search for: ");
        String word = sc.next();
        String res = "";
        for (int i = 0; i < str.length()-word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                res += str.substring(0, i) + str.substring(i+1+word.length());
            }
        }
        System.out.println(res);
    }
}
/*
Sentence:
hello cat hi
Word to search for: cat
hello hi
 */