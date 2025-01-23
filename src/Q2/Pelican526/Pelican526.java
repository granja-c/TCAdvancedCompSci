package Q2.Pelican526;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Pelican526 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/marquee.dat"));
            while (sc.hasNext()) {
                var cd = new CircularDQ<Character>();
                int num = sc.nextInt();
                sc.next();
                String str = sc.nextLine();
                cd.insertFront(str.charAt(0));
                for (int i = 1; i < str.length(); i++) {
                    cd.insertLast(str.charAt(i));
                }
                for (int i = 0; i < num; i++) {
                    char c = cd.getFront();
                    cd.deleteFront();
                    cd.insertLast(c);
                }

                for (int i = 0; i < cd.getSize(); i++) {
                    System.out.printf("%c", cd.getFront());
                    cd.deleteFront();
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
