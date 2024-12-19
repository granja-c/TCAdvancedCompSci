package Q2;
import java.util.*;

import DataStructures.BinarySearchTree;

public class BigTree {
    public static void main(String[] args) {
        var tree = new BinarySearchTree<Integer>();
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            int n = (int)(Math.random() * 100) + 1;
            sum += n;
            System.out.print(n + " ");
            tree.insert(n);
        }

        tree.printInOrder();
        tree.printPreOrder();
        System.out.println(tree.getSize());
        tree.insert((int)(Math.random() * 102) + 51);
        System.out.println(tree.search(32));
        double avg = sum/tree.getSize();
        System.out.println(tree.getClosest((int)avg));
        System.out.println(avg);
        System.out.println(tree.getHeight());
        System.out.println(tree.getWidth());
        tree.printLevelOrder();
        tree.printDepthFirst();
    }
}
