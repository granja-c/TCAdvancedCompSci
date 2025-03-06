package Q3;
import Algorithms.SortingAlgorithms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog485a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog485a.dat"));
            var n = new ArrayList<Integer>();

            while (sc.hasNext()) {
                n.add(sc.nextInt());
            }
            Integer[] nums = new Integer[n.size()];
            var uniq = new ArrayList<Integer>();
            var frq = new ArrayList<Integer>();
            for (int i = 0; i < n.size(); i++) {
                if (!uniq.contains(n.get(i))) {
                    uniq.add(n.get(i));
                    frq.add(1);
                } else {
                    int ind = uniq.indexOf(n.get(i));
                    frq.set(ind, frq.get(ind) + 1);
                }
                nums[i] = n.get(i);
            }
            SortingAlgorithms.heapSort(nums);
            SortingAlgorithms.heapSort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
            for (int i = 0; i < uniq.size(); i++) {
                System.out.println(uniq.get(i) + "\t" + frq.get(i));
            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
