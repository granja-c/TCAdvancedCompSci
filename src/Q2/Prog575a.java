package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog575a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog575a.dat"));

            while (sc.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
