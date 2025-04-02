package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import DataStructures.LRUCache;

public class Prog1062x {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog1062x.dat"));
            var cache = new LRUCache<Integer, Character>(100);

            while (sc.hasNext()) {
                String comm = sc.next();
                if (comm.equals("PUT")) {
                    cache.put(sc.nextInt(), sc.next().charAt(0));
                }
                else if (comm.equals("GET")) {
                    System.out.println(cache.get(sc.nextInt()));
                }
                else {
                    cache.report();
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
