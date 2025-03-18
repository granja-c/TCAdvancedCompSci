package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog595r {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/ dale-chall-word-list.txt"));

            while (sc.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}

