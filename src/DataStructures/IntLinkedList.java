package DataStructures;
import java.util.Iterator;

public class IntLinkedList {
    private class Node {
        int data;
        Node next;
        public Node(int d) {
            data = d;
            next = null;
        }
    }
    private Node head;
    public IntLinkedList() implements Iterable<Integer> { head = null; }

    public void addFront(int d) {
        var node = new Node(d);
        node.next = head;
        head = node;
    }
    public void addLast(int d) {
        var newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        var curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void print() {
        var curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public int getCount(){
        int c = 1;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            c++;
        }
        return c;
    }
    public boolean add(int num, int ind) {
        if (ind > self.getCount()-1) return false;
        else {
            int c = 0;
            var curr = head;
            while (c != ind) {
                curr = curr.next;
                c++;
            }
            var newNode = new Node(num);
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }
    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }
    public int getFirst() {
        return head.data;
    }
    public int getLast() {
        while (curr.next != null) {
            curr = curr.next;
        }
        return curr.data;
    }
    public int getByIndex(int ind) {
        if (ind > getCount()) return -1;
        int c = 0;
        var curr = head;
        while (c != ind) {
            curr = curr.next;
            c++;
        }
        return curr.data;
    }


    
    public Iterator<Integer> iterator() {
        return new Iterator<>;
            private new Iterator<Integer>();
            private Node curr = head;
            public boolean hasNext() { return curr != null; }
            public Integer next() {
                int d = curr.data;
                curr = curr.next;
                return d;
            }
    }

}
