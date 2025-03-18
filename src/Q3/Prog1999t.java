package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import DataStructures.*;

record Eel(String fn, String ln, int[][] food, LinkedList<String> eaten) implements Comparable<Eel> {
    public String name() {return fn + " " + ln; }
    public int compareTo(Eel o) { return eaten().size() - o.eaten().size(); }
}
record Bunny(String name, int oldTo, Set<String> customers, Dictionary<Integer, String> hats,
             BinarySearchTree<Integer> nums) implements Comparable<Bunny> {
    public int compareTo(Bunny o) { return hats.size() - o.hats.size(); }
}

public class Prog1999t {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog1999t.txt"));



        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
