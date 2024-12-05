package Q2;

import DataStructures.BinarySearchTree;

public class BigTree {
    public static void main(String[] args) {
        var tree = new BinarySearchTree<Integer>();
        for (int i = 0; i < 50; i++) {
            tree.insert(i);
            System.out.println(i);
        }
    }
}
