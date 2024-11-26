package Q2.Prog285b2;
import DataStructures.BinarySearchTree;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog285bBinaryTree {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog285b.dat"));
            var tree = new BinarySearchTree<Cl285b2>();

            System.out.println("Id\tCode\tSales\tCommission");
            while (file.hasNext()) {
                int id = file.nextInt();
                int c = file.nextInt();
                double s = file.nextDouble();

                var fred = new Cl285b2(id, c, s);
                tree.insert(fred);
            }
            tree.printInOrder();
            file.close();



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
