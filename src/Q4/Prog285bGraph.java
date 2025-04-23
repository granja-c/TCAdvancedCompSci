package Q4;
import DataStructures.GraphList;
import Q3.Prog285b3.Cl285b3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog285bGraph {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog285b.dat"));
            var graph = new GraphList<Cl285b3>();

            System.out.println("Id\tCode\tSales\tCommission");
            while (file.hasNext()) {
                int id   = file.nextInt();
                int c    = file.nextInt();
                double s = file.nextDouble();

                var fred = new Cl285b3(id, c, s);
                graph.addVertex(fred);
            }
            file.close();


            var nodes = graph.getVertices().keySet();
            var list = new ArrayList<Cl285b3>();
            for (var node : nodes) {
                list.add(node);
            }
            for (int i = 0; i < 7; i++) {
                int r1 = (int)(Math.random() * nodes.size());
                int r2 = (int)(Math.random() * nodes.size());
                if (r1 != r2) graph.addEdge(list.get(r1), list.get(r2));
            }
            graph.display();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}