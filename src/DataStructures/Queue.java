package DataStructures;

@SuppressWarnings("unchecked")
public class Queue<T extends Comparable<T>> {
    protected T[] queue;
    protected int front;
    protected int rear;
    protected int size;
    protected int capacity;

    public Queue() {
        size = 0;
        capacity = 1;
        queue = (T[])new Comparable[capacity];
        front = 0;
        rear = 0;
    }
    protected void resize(int cap) {
        if (cap < 1) cap = 1;
        T[] newQueue = (T[]) new Comparable[cap];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front+i)%capacity];
        }
        queue = newQueue;
        capacity = cap;
        front = 0;
        rear = size;
    }
    public void enqueue(T element) {
        if (size == capacity) resize(2*capacity);
        queue[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }
    public T dequeue() {
        T element = queue[front];
        front = (front + 1) % capacity;
        size--;
        if (size == capacity / 4) resize(capacity/2);
        return element;
    }

    public T peek() { return queue[front]; }
    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }



}
