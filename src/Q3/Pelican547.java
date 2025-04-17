package Q3;

import DataStructures.Heap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Pelican547 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/HeapData.dat"));
            var minh = new Heap<String>(true);
            while (sc.hasNext()) {
            minh.insert(sc.next());
            }
            sc.close();
            int line = 1;
            int ind = 0;
            while (!minh.isEmpty()) {
                System.out.print(minh.delete() + " ");
                ind++;
                if (ind == (Math.pow(2, line)-1)) {
                    System.out.println();
                    line++;
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
