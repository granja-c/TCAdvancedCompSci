package Q4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import Algorithms.GraphAlgorithms;
import DataStructures.Dictionary;
import DataStructures.GraphList;
import DataStructures.Graph;

public class Prog5000d {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog5000d.txt"));
            var  vertexData = new Dictionary<String, String>();
            var graph = new GraphList<String>();
            boolean foundEdges = false;

            sc.nextLine();
            while (sc.hasNextLine()) {
                var line = sc.nextLine();
                if (line.equals("Edges: ")) {
                    foundEdges = true;
                    continue;
                }
                var parts = line.split("\t");
                if (!foundEdges) {
                    graph.addVertex(parts[0]);
                    vertexData.insert(parts[0], parts[1]);
                } else graph.addEdge(parts[0], parts[1]);
                graph.display();

                var distances = GraphAlgorithms.shortestPath(graph, "A");
                var closestDistance = "";
                int minDistance = Integer.MAX_VALUE;
                for (var d : distances.entrySet()) {
                    if (d.value < minDistance && !d.key.equals("A") && !d.key.startsWith("T")) {
                        minDistance = d.value;
                        closestDistance = d.key;
                    }
                }
                System.out.printf("Closest city to %s: %s", vertexData.get("A"), vertexData.get(closestDistance));
                System.out.printf("\nDistances from $s: ", vertexData.get("A"));
                for (var entry: distances.entrySet()) {
                    if (!entry.key.equals("A") && !entry.key.startsWith("T")) {
                        System.out.println(vertexData.get(entry.key) + "+" + entry.value);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
