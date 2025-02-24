package Q3;
import DataStructures.UnionFind;

public class UnionFindLab {
    private final UnionFind unionFind;
    public UnionFindLab(int n) {
        unionFind = new UnionFind(n);
    }
    public void addBridge(int x, int y) { unionFind.union(x, y); }
    public boolean areConnected(int x, int y) { return unionFind.connected(x, y); }
    public int numGroups() { return unionFind.count(); }

    public static void main(String[] args) {
        // Case 1
        var icf = new UnionFindLab(5);
        System.out.println(icf.numGroups());

        // Case 2
        icf.addBridge(0,1);
        System.out.println(icf.areConnected(0, 1));
        System.out.println(icf.numGroups());

        // Case 3
        icf.addBridge(2,3);
        icf.addBridge(1,2);
        System.out.println(icf.areConnected(0, 3));
        System.out.println(icf.numGroups());

        // Case 4
        icf.addBridge(0,3);
        System.out.println(icf.numGroups());
    }
}
