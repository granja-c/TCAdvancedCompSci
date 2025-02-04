package Q3.Prog505a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/X.dat"));

            while (sc.hasNext()) {
                String str = sc.next();
                // int
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
