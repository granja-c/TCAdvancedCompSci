package Q1;

import Algorithms.SortingAlgorithms;
import DataStructures.DynamicArray;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Prog482i {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/numsort.dat"));
            var nums = new DynamicArray<Integer>();

            while (sc.hasNext())
                nums.add(sc.nextInt());
            sc.close();
            var numsArr = nums.toArray();
            System.out.println("Original list: " + nums);
            SortingAlgorithms.insertionSort(numsArr);
            System.out.println("Sorted list: " + Arrays.toString(numsArr));

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
