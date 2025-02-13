package DataStructures;

public class Heaps <T extends Comparable<T>>{
    private static final int DEFAULT_CAPACITY = 16;
    T[] heap;
    private int size;
    private int capacity;
    private final boolean minHeap;

    public Heap() { this(DEFAULT_CAPACITY, false); }
    public Heap(int cap) { this(cap, false); }
    public Heap(boolean minHeap) { this(DEFAULT_CAPACITY, minHeap); }
    public Heap (int cap, boolean minHeap) {
        this.capacity = cap;
        this.minHeap = minHeap;
        size = 0;
        heap = (T[]) new Comparable[cap];
    }

    public void insert(T element) {
        if (size == capacity) resize(2 * capacity);
        heap[size++] = element;
        swim(size-1);
    }

    public T delete() {
        if (size == 0) return null;
        T element = heap[0];
        heap[0] = heap[size--];
        heap[size] = null;
        sink(0);
        if (size > 0 && size == capacity/4) { resize(capacity/2); }
        return element;
    }

    public T peek() { return size==0 ? null : heap[0]; }
    public boolean isEmpty() { return size==0; }
    int compare(T a, T b) {return minHeap ? b.compareTo(a) : a.compareTo(b); }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void resize(int newCapacity) {
        T[] newHeap = (T[]) new Comparable[newCapacity];
        System.arraycopy(heap, 0, newHeap, 0, size);
        heap = newHeap;
        capacity = newCapacity;
    }
}
