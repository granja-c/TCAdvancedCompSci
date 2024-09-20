package Q1;

import Algorithms.SearchAlgorithms;
import Utils.Console;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog460a {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(new File("Langdat/sort.dat"));
            var nums = new ArrayList<Integer>();
            while (sc.hasNext()) {
                nums.add(sc.nextInt());
            }
            sc.close();

            int lcv = 0;
            var arr = new Integer[nums.size()];
            for (var n : nums) arr[lcv++] = n;

            int num = 0;
            do {
                num = Console.input("Enter a number to search for: ");
                int pos = SearchAlgorithms.binarySearchRecursive(arr, num);
                System.out.println(pos == -1 ? "Your number does not occur in the list \n" : "Your number occurs at index " + (pos+1) + "\n");
            } while(num != -1);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
