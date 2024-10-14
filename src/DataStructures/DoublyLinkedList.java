package DataStructures;

public class DoublyLinkedList<T extends Comparable<T>>{
    private class Node implements Comparable<Node> {
        T data;
        Node prev;
        Node next;

        Node(T dat) {
            data = dat;
            prev = null;
            next = null;
        }

        public int compareTo(Node o) {
            return data.compareTo(o.data);
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public void add(T element) {
        var temp = new Node(element);
        if (head == null) head = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
        }
        tail = temp;
        size++;
    }

    public void addSorted(T element) {

    }
    public void addFront(T element) {
        var newNode = new Node(element);
        if (head == null) head = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void insert(int ind, T element) {
        if (ind >= size || ind == 0) throw new IndexOutOfBoundsException();
        var curr = head;
        for (int i = 0; i < ind; i++) {
            curr = curr.next;
        }
        var newNode = new Node(element);
        newNode.prev = curr.prev;
        curr.prev.next = newNode;
        newNode.next = curr;
        curr.prev = newNode;
    }

    public void remove(int ind) {
        if (ind >= size || ind == 0) throw new IndexOutOfBoundsException();
        var curr = head;
        for (int i = 0; i < ind-1; i++) {
            curr = curr.next;
        }
        curr.next.next.prev = curr;
        curr.next = curr.next.next;
        size--;
    }
    public T get(int ind) {
        if (ind >= size || ind == 0) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < ind; i++) curr = curr.next;
        return curr.data;
    }
    public void set(int ind, T element) {
        if (ind >= size || ind == 0) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < ind; i++) curr = curr.next;
        var newNode = new Node(element);
        newNode.prev = curr.prev;
        curr.prev.next = newNode;
        newNode.next = curr.next;
        newNode.next.prev = newNode;
    }
    public void print() {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data + " ");
        }
    }
    public void printReverse() {
        for (Node curr = tail; curr != null; curr = curr.prev) {
            System.out.print(curr.data + " ");
        }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size==0; }



}
