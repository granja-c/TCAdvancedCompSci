package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class MSOE072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vow = new ArrayList<>();
        vow.add("a");
        vow.add("e");
        vow.add("i");
        vow.add("o");
        vow.add("u");
        System.out.println("Sentence: ");
        String words = sc.nextLine();
        int c = 0;
        for (int i = 0; i < words.length(); i++) {
            if (vow.contains(words.substring(i, i+1))) c++;
        }
        System.out.println("vowels: " + c);
    }
}
