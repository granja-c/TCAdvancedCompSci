package Q4;
import java.util.ArrayList;
import java.util.Arrays;

import DataStructures.Dictionary;
import DataStructures.GraphMatrix;

public class AdjMatrixLab {
    public static <T extends Comparable<T>> void colorGraph(GraphMatrix<T> graph) {
        int vcount = graph.getVertexCount();
        int[][] matrix = graph.getMatrix();
        Dictionary<T, Integer> vertices = graph.getVertices();
        int[] result = new int[vcount];
        Arrays.fill(result, -1);

        result[0] = 0;
        boolean[] available = new boolean[vcount];
        for (int u = 1; u < vcount; u++) {
            Arrays.fill(available, true);
            for (int v = 0; v < vcount; v++) {
                if (matrix[u][v] != 0 && result[v] != -1) { available[result[v]] = false; }
            }
            int color;
            for (color = 0; color<vcount; color++) {
                if (available[color]) break;
            }
            result[u] = color;
        }
        System.out.println("Vertex colors: ");
        for (int i = 0; i < vcount; i++) {
            System.out.println("Vertex: " + vertices.getKey(i) + " --> Color: " + result[i]);
        }
    }

    public static void main(String[] args) {
        var graph = new GraphMatrix<String>(6);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("C", "F");
        graph.addEdge("C", "E");
        graph.addEdge("E", "F");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "F");
        graph.displayGraph();
        System.out.println();
        colorGraph(graph);
    }
}
