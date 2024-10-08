package DataStructures;
import java.util.Iterator;

public class IntLinkedList implements Iterable<Integer> {
    private class Node {
        int data;
        Node next;
        public Node(int d) {
            data = d;
            next = null;
        }
    }
    private Node head;
    public IntLinkedList() { head = null; }

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
            System.out.print(curr.data + ", ");
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
        if (ind > getCount()-1) return false;
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
        return true;
    }
    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }

    public int getFirst() {
        return head.data;
    }

    public int getLast() {
        var curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        return curr.data;
    }
    public int getByIndex(int ind) {
        if (ind > getCount()-1) return -1;
        int c = 0;
        var curr = head;
        while (c != ind) {
            curr = curr.next;
            c++;
        }
        return curr.data;
    }
    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        int ind = getCount();
        var curr = head;
        int c = 1;
        while (c < ind-2) {
            curr = curr.next;
            c++;
        }
        curr.next = null;
    }

    public int countLessTen(){
        var curr = head;
        int count = 0;
        while (curr.next != null) {
            if (curr.data < 10) count++;
            curr = curr.next;
        }
        return count;
    }

    public void removeByIndex(int ind) {
        var curr = head;
        for (int i = 0; i < ind-1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    public void clear() {
        head = null;
    }

    public boolean contains(int n) {
        var curr = head;
        while (curr.next != null) {
            if (curr.data == n) return true;
        }
        return false;
    }

    // reverse

    public double avg() {
        double c = 0;
        int tot = 0;
        var curr = head;
        while (curr != null) {
            c++;
            tot += curr.data;
        }
        return (tot/c);
    }

    public int getMax() {
        int max = head.data;
        var curr = head;
        while (curr.next != null) {
            if (curr.data > max) max = curr.data;
        }
        return max;
    }

    public int getMin() {
        int min = head.data;
        var curr = head;
        while (curr.next != null) {
            if (curr.data < min) min = curr.data;
        }
        return min;
    }

    public int getMaxIndex() {
        int max = getMax();
        var curr = head;
        int c = 0;
        while (curr != null) {
            if (curr.data == max) return c;
            curr = curr.next;
            c++;
        }
        return c;
    }

    public int getMinIndex() {
        int min = getMin();
        var curr = head;
        int c = 0;
        while (curr != null) {
            if (curr.data == min) return c;
            curr = curr.next;
            c++;
        }
        return c;
    }

    public int getLastMaxInd() {
        int max = getMax();
        var curr = head;
        int res = 0;
        int c = 0;
        while (curr != null) {
            if (curr.data == max) res = c;
            curr = curr.next;
            c++;
        }
        return res;
    }

    //sort
    public void sort() {
        while (sorted() == false) {
            int minInd = getMinIndex();
            int min = getMin();
        }
    }

    public boolean sorted() {
        var curr = head;
        while (curr.next != null) {
            if (curr.data > curr.next.data) return false;
        }
        return true;
    }

    public int remove58() {
        int c = 0;
        if (head.data == 58) head = head.next;
        var curr = head;
        for (int i = 1; i < getCount()-1; i++) {
            if (curr.next.data == 58) {
                curr.next = curr.next.next;
                c++;
            }
        }
        return c;
    }

    public int evenCount(){
        int c = 0;
        var curr = head;
        while (curr != null) {
            if (curr.data % 2 == 0) c++;
            curr = curr.next;
        }
        return c;
    }

    public int removeOdds() {
        int c = 0;
        if (head.data % 2 == 1) head = head.next;
        var curr = head;
        for (int i = 1; i < getCount()-1; i++) {
            if (curr.next.data % 2 == 1) {
                curr.next = curr.next.next;
                c++;
            }
        }
        return c;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public Integer next() {
                int data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
