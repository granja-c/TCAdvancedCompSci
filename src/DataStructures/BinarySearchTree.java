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
    int size;


    public BinarySearchTree() {
        size = 0;
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
        size++;
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
        size--;
        return node;
    }
    public int getSize() { return size; }
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
    public T getClosest(T value) {
        return closest(root, value).data;
    }
    private Node closest(Node node, T value) {
        if (node == null) return null;
        if (node.right != null && value.compareTo(root.data) > 0) {
            closest(node.right, value);
        }
        if (node.left != null && value.compareTo(root.data) < 0) {
            closest(node.left, value);
        }
        return node;
    }
    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void printPreOrder() {
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void printPostOrder() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }



    public void printLevelOrder() {
        levelOrder();
    }
    private void levelOrder() {
        Queue<Node> q = new Queue<>();
        q.enqueue(root);
        while (!q.isEmpty()) {
            Node node = q.dequeue();
            System.out.print(node.data + " ");
            if (node.left != null) q.enqueue(node.left);
            if (node.right != null) q.enqueue(node.right);
        }
    }

    public void printDepthFirst() {
        depthFist();
    }
    private void depthFist() {
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            Node node = s.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
        }
    }

    public void invert() { root = invert(root); }
    private Node invert(Node node) {
        if (node == null) return null;
        Node l = invert(node.left);
        node.left = invert(node.right);
        node.right = l;
        return node;
    }
    public int getHeight() { return height(root); }
    private int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
    public int getWidth() { return width(root); }
    public int width(Node node) {
        if (node == null) return 0;
        Queue<Node> queue = new Queue<>();
        queue.enqueue(node);
        int max = 0;
        while (!queue.isEmpty()) {
            int c = queue.size();
            max = Math.max(max, c);
            while (c --> 0) {
                Node curr = queue.dequeue();
                if (curr.left != null) queue.enqueue(curr.left);
                if (curr.right != null) queue.enqueue(curr.right);
            }
        }
        return max;
    }

}
