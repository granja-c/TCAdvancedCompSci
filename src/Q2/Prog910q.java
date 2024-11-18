package Q2;
import Algorithms.SortingAlgorithms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog910q {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/numsort.dat"));
            var nums = new ArrayList<Integer>();

            while (sc.hasNextInt()) {
                nums.add(sc.nextInt());
            }

            var numsArr = nums.toArray(new Integer[0]);
            SortingAlgorithms.quickSort(numsArr);
            for (int i : numsArr) {
                System.out.println(i);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
