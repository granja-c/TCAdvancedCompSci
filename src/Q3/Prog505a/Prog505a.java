package Q3.Prog505a;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import DataStructures.Set;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog505a.dat"));
            var readers = new Set<Cl505a>();
            while (sc.hasNext()) {
                String fname = sc.next();
                String lname = sc.next();
                int books = sc.nextInt();
                var reader = new Cl505a((fname + " " + lname), books);
                readers.insert(reader);
            }
            int tot = 0;

            var iter = readers.iterator();
            var arr = new ArrayList<Cl505a>();

            while (iter.hasNext()) {
                arr.add(iter.next());
            }
            Cl505a n = arr.get(0);
            for (Cl505a i : arr) {
                System.out.println(i.toString());
                if (i.getPoints() > n.getPoints()) n = i;
                tot += i.getPoints();
            }
            System.out.println("Average points: " + tot/arr.size());
            System.out.println("Winner: " + n.getName());

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
