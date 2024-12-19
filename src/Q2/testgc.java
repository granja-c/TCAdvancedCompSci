package Q2;
import java.util.*;
import DataStructures.BinarySearchTree;

public class testgc {
    public static void main(String[] args) {
        var tree = new BinarySearchTree<Integer>();
        for (int i = 0; i < 30; i++) {
            int n = (int)(Math.random() * 50) + 1;
            System.out.print(n + " ");
            tree.insert(n);
        }
        System.out.println(tree.getClosest(15));

    }
}
