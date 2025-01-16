package DataStructures;

public class QStack<T extends Comparable<T>>{
    private Queue<T> q1;
    private Queue<T> q2;

    public QStack() {
        q1 = new Queue<>();
        q2 = new Queue<>();
    }

    public void push(T element) {
        q2.enqueue(element);
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }
        var q = q1;
        q1 = q2;
        q2 = q;
    }

    public T pop() { return q1.dequeue(); }
    public T peek() { return q1.peek(); }
    public boolean isEmpty() { return q1.isEmpty(); }
    public int size() { return q1.size(); }
}
