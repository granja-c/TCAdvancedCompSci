package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Algorithms.SortingAlgorithms;
public class Prog575a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/numsort.dat"));
            ArrayList<Integer> arr = new ArrayList<>();

            while (sc.hasNext()) {
                int num = sc.nextInt();
                arr.add(num);
            }
            Integer[] a = new Integer[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                a[i] = arr.get(i);
            }

            SortingAlgorithms.mergeSort(a);
            for (Integer i : a) {
                System.out.println(a);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
