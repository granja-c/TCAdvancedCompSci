package Q3;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prog595r {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/dale-chall-word-list.txt"));
            Set<String> set = new HashSet<String>();

            while (file.hasNext()) {
                set.add(file.next());
            }
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] sents = text.split("[.?!]");
            String[] words = text.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].replaceAll("^a-zA-Z", "").toLowerCase();
            }

            double dif = 0;
            for (String w : words) {
                Boolean fam = false;
                if (!set.contains(w)) dif++;
            }

            double score = 0;
            score = 0.1579 * (dif/words.length * 100) + 0.0496 * ((double)words.length / sents.length);

            System.out.println(score);
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}

