package Q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog705x {
    public static void main(String[] args) {
        try {
            Scanner sc1 = new Scanner(new File("Langdat/prog512h.dat"));
            Scanner sc2 = new Scanner(new File("Langdat/prog705x.dat"));
            var poem = new ArrayList<String>();
            var code = new ArrayList<Integer>();
            while (sc1.hasNext()) {
                String line = sc1.nextLine();
                poem.add(line);
            }
            while (sc2.hasNext()) {
                int n = sc1.nextInt();
                code.add(n);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
