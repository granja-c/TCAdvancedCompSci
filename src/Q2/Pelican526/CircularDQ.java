package Q2.Pelican526;


import DataStructures.CircularLL;

public class CircularDQ<T extends Comparable<T>> {
    private class Node implements Comparable<Node> {
        T data;
        Node next;
        Node prev;
        Node(T data) {
            this.data = data;
            next = null;
            prev = null;
        }
        public int compareTo(Node x) { return data.compareTo(x.data); }

    }


    private Node front;
    private Node rear;
    private int size;

    public CircularDQ() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean insertFront(T val) {
        Node node = new Node(val);
        if (isEmpty()) {
            front = node;
            rear = node;
            front.next = front;
            front.prev = front;
        } else {
            node.next = front;
            node.prev = rear;
            front.prev = node;
            rear.next = node;
            front = node;
        }
        size++;
        return true;
    }

    public boolean insertLast(T val) {
        Node node = new Node(val);
        if (isEmpty()) {
            front = node;
            rear = node;
            front.next = front;
            front.prev = front;
        } else {
            node.prev = rear;
            node.next = front;
            rear.next = node;
            front.prev = node;
            rear = node;
        }
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            front.prev = rear;
            rear.next = front;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            rear = rear.prev;
            front.prev = rear;
            rear.next = front;
        }
        size--;
        return true;
    }

    public T getFront() {
        if (isEmpty()) return null;
        return front.data;
    }
    public T getRear() {
        if (isEmpty()) return null;
        return rear.data;
    }

    public boolean isEmpty() {return size == 0; }
    public int getSize() { return size; }
}
