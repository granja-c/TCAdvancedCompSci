package DataStructures;

public class GraphMatrix<T extends Comparable<T>> implements Graph<T> {
    private final Dictionary<T, Integer> vertices;
    private final int[][] matrix;
    private int vertexCount;

    public GraphMatrix(int size) {
        vertices = new Dictionary<>();
        matrix = new int[size][size];
        vertexCount = 0;
    }

    @Override
    public void addVertex(T vertex) {
        if (!vertices.containsKey(vertex)) vertices.insert(vertex, vertexCount++);
    }

    @Override
    public void addEdge(T source, T destination) {
        addEdge(source, destination, 1);
    }
    public void addEdge(T source, T destination, int weight) {
        int sourceInd = vertices.get(source);
        int destinationInd = vertices.get(destination);
        matrix[destinationInd][sourceInd] = weight;
        matrix[sourceInd][destinationInd] = weight;
    }

    public void addDirectedEdge(T source, T destination, int weight) {
        int sourceInd = vertices.get(source);
        int destinationInd = vertices.get(destination);
        matrix[sourceInd][destinationInd] = weight;
    }
    public void addDirectedEdge(T source, T destination) {
        addDirectedEdge(source, destination, 1);
    }

    @Override
    public void removeVertex(T vertex) {
        if (!vertices.containsKey(vertex)) vertices.remove(vertex);
        int ind = vertices.get(vertex);
        for (int i = 0; i < vertexCount; i++) {
            matrix[i][ind] = 0;
            matrix[ind][i] = 0;
        }
        vertices.remove(vertex);
        vertexCount--;
    }

    @Override
    public void removeEdge(T source, T destination) {
        int sourceInd = vertices.get(source);
        int destinationInd = vertices.get(destination);
        matrix[destinationInd][sourceInd] = 0;
        matrix[sourceInd][destinationInd] = 0;
    }
    public void removeDirectedEdge(T source, T destination) {
        int sourceInd = vertices.get(source);
        int destinationInd = vertices.get(destination);
        matrix[sourceInd][destinationInd] = 0;
    }

    @Override
    public boolean hasVertex(T vertex) {
        return vertices.containsKey(vertex);
    }

    @Override
    public boolean hasEdge(T source, T destination) {
        int sourceInd = vertices.get(source);
        int destinationInd = vertices.get(destination);
        return matrix[sourceInd][destinationInd] != 0;
    }

    @Override
    public void displayGraph() {
        System.out.println("Vertices: ");
        vertices.enumerate();
        System.out.println("Matrix:");
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public int getEdgeWeight(T source, T destination) {
        int sourceInd = vertices.get(source);
        int destinationInd = vertices.get(destination);
        return matrix[sourceInd][destinationInd];
    }

    @Override
    public Dictionary<T, Integer> getVertices() {
        return vertices;
    }
    public int[][] getMatrix() { return matrix; }
    public int getVertexCount() { return vertexCount; }
    @Override
    public DynamicArray<T> getNeighbors(T vertex) {
        DynamicArray<T> neighbors = new DynamicArray<>();
        int sourceInd = vertices.get(vertex);
        for (int i = 0; i < vertexCount; i++) {
            if (matrix[sourceInd][i] != 0)
                neighbors.add(vertices.getKey(i));
        }
        return neighbors;
    }
}
