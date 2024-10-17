package Q1;
import java.util.*;
import DataStructures.DynamicArray;

public class DynamicArrayLab {
    public static void main(String[] args) {
        var dArray = new DynamicArray<Integer>();
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            dArray.add((int)(Math.random() * 100000));
        }
        long end = System.nanoTime();
        System.out.println("Dynamic Array add: " + (end-start)/1e6 + " ms");

        start = System.nanoTime();
        dArray.sort();
        end = System.nanoTime();
        System.out.println("Dynamic Array sort: " + (end-start)/1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            dArray.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Dynamic Array remove: " + (end-start)/1e6 + " ms");



        //check against arrayList
        var list = new ArrayList<Integer>();
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list.add((int)(Math.random() * 100000));
        }
        end = System.nanoTime();
        System.out.println("ArrayList add: " + (end-start)/1e6 + " ms");

        start = System.nanoTime();
        list.sort(null);
        end = System.nanoTime();
        System.out.println("ArrayList sort: " + (end-start)/1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list.remove(0);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add: " + (end-start)/1e6 + " ms");


    }
}
