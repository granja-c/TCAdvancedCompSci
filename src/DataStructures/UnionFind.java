package DataStructures;

public class UnionFind {
    private final int[] parent;
    private final int[] rank;
    private int count;

    public UnionFind(int size) {
        if (size <= 0) throw new IllegalArgumentException("Size must be greater than 0");
        parent = new int[size];
        rank = new int[size];
        count = size;
        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    private void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0;
    }

    public int find(int p) {
        if (p != parent[p]) parent[p] = find(parent[p]);
        return parent[p];
    }
    public void union(int p, int q) { // making p and q share a parent
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot != qRoot) {
            if (rank[pRoot] > rank[qRoot]) parent[qRoot] = pRoot;
            else if (rank[pRoot] < rank[qRoot]) parent[pRoot] = qRoot;
            else {
                parent[qRoot] = pRoot;
                rank[pRoot]++;
            }
            count--;
        }
    }

    public int count() { return count; }
    public int size() { return parent.length; }
    public boolean connected(int x, int y) { return find(x) == find(y); }
}
