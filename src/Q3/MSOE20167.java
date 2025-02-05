package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MSOE20167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name: "); // puzzle.dat
        String f = sc.next();
        try {
            Scanner file = new Scanner(new File(f));

            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
