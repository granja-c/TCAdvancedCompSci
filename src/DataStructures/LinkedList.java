package DataStructures;

public class LinkedList<T extends Comparable<T>>{
    private class Node implements Comparable<Node> {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
        public int compareTo(Node o) { return data.compareTo(o.data); }
    }
    private Node head;
    private int size;
    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean add(T item) {
        var newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while(curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
        size++;
        return true;
    }
    public T remove(int ind) {
        T old;
        if (ind == 0) {
            old = head.data;
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < ind-1; i++) {
                curr = curr.next;
            }
            old = curr.next.data;
            curr.next = curr.next.next;
        }
        size--;
        return old;
    }

    public T get(int ind) {
        Node curr = head;
        for (int i = 0; i < ind; i++) curr = curr.next;
        return curr.data;
    }
    public T set(int ind, T item) {
        T old;
        Node curr = head;
        for (int i = 0; i < ind; i++) curr = curr.next;
        old = curr.data;
        curr.data = item;
        return old;
    }

    public void print() {
         for (Node curr = head; curr != null; curr = curr.next)
             System.out.print(curr.data + " ");
        System.out.println();
    }
    public int size() { return size; }
    public boolean isEmpty() { return size==0; }
}
