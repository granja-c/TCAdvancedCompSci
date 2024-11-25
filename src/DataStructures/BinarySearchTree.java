package DataStructures;

public class BinarySearchTree<T extends Comparable<T>> {
    protected class Node implements Comparable<Node> {
        T data;
        Node left;
        Node right;
        public Node(T dat) {
            data = dat;
            left = null;
            right = null;
        }
        public int compareTo(Node o) { return data.compareTo(o.data); }
    }
    protected Node root;

    public BinarySearchTree() {
        root = null;
    }
    private void insert(T element) {
        root = insert(root, element);
    }
    public Node insert(Node node, T element) {
        if (node == null) return new Node(element);
        if (element.compareTo(node.data) < 0)
            node.left = insert(node.left, element);
        else if (element.compareTo(node.data) > 0)
            node.right = insert(node.right, element);
        return node;
    }

    public void printInOrder() {
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

}
