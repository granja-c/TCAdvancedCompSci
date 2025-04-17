package Q3.Prog285b3;
import DataStructures.Set;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog285bSet {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog285b.dat"));
            var set = new Set<Cl285b3>();

            System.out.println("Id\tCode\tSales\tCommission");
            while (file.hasNext()) {
                int id = file.nextInt();
                int c = file.nextInt();
                double s = file.nextDouble();

                var fred = new Cl285b3(id, c, s);
                set.insert(fred);
            }
            file.close();

            var iter = set.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}