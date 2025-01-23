package DataStructures;

import java.util.Iterator;

public class CircularLL<T extends Comparable<T>> implements Iterable<T> {
    private class Node implements Comparable<Node> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            next = null;

        }
        public int compareTo(Node x) { return data.compareTo(x.data); }
    }
    private Node head;
    private int size;
    public CircularLL() {
        head = null;
        size = 0;
    }
    public void add(T element) {
        var newNode = new Node(element);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node curr = head;
            while (curr.next != head) curr = curr.next;
            curr.next = newNode;
            newNode.next = head;
        }
        size++;
    }
    public void remove(int ind) {
        if (ind < 0 || ind >= size) throw new IndexOutOfBoundsException();
        Node curr = head;
        if (ind == 0) {
            while (curr.next != head) curr = curr.next;
            head = head.next;
            curr.next = head;
        } else {
            for (int i = 0; i < ind-1; i++) curr = curr.next;
            curr.next = curr.next.next;
        }
        size--;
    }
    public T get(int ind) {
        if (ind < 0 || ind >= size) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < ind; i++) curr = curr.next;
        return curr.data;
    }
    public void set(int ind, T element) {
        if (ind < 0 || ind >= size) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < ind; i++) curr = curr.next;
        curr.data = element;
    }
    public void print() {
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }
    public int size() { return size; }
    public boolean isEmpty() { return size==0; }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node curr = head;
            private int ind = 0;
            public boolean hasNext() {
                return (ind < size);
            }
            public T next() {
                T data = curr.data;
                curr = curr.next;
                ind++;
                return data;
            }
        };
    }
}
