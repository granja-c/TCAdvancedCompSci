package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import DataStructures.Set;
public class Prog595r {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/dale-chall-word-list.txt"));
            var set = new Set<String>();

            while (file.hasNext()) {
                set.insert(file.next());
            }
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] sents = text.split("[.?!]");


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}

