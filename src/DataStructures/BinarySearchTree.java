package DataStructures;

public class BinarySearchTree<T extends Comparable<T>> {
    protected class Node implements Comparable<Node> {
        T data;
        Node left;
        Node right;
        Node(T dat) {
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
    public void insert(T element) {
        root = insert(root, element);
    }
    private Node insert(Node node, T element) {
        if (node == null) return new Node(element);
        if (element.compareTo(node.data) < 0)
            node.left = insert(node.left, element);
        else if (element.compareTo(node.data) > 0)
            node.right = insert(node.right, element);
        return node;
    }

    private boolean search(Node node, T element) {
        if (node == null) return false;
        if (element.compareTo(node.data) < 0) {
            return search(node.left, element);
        } else if (element.compareTo(node.data) > 0) {
            return search(node.right, element);
        }
        return true;
    }
    public boolean search(T element) {
        return search(root, element);
    }
    public T getRootData() { return root.data; }

    public void delete(T element) {
        root = delete(root, element);
    }
    private Node delete(Node node, T element) {
        if (node == null) return null;
        if (element.compareTo(node.data) < 0) {
            node.left = delete(node.left, element);
        } else if (element.compareTo(node.data) > 0) {
            node.right = delete(node.right, element);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            Node min = findMin(node.right);
            node.data = min.data;
            node.right = delete(node.right, min.data);
        }
        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    private Node findMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }
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
