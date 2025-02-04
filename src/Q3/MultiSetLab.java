package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import DataStructures.Bag;

public class MultiSetLab {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/words"));
            var bag = new Bag<String>();
            var rand = new java.util.Random(42);

            while (sc.hasNext()) {
                String word = sc.next().toLowerCase();
                for (int i = 0; i < rand.nextInt(1, 11); i++) {
                    bag.insert(word);
                }
            }
            sc.close();
            bag.enumerate();
            // top 10 common words

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
