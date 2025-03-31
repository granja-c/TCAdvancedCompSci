package DataStructures;

public class PriorityQueue<T extends Comparable<T>> {
    private final Heap<T> heap;
    public PriotityQueue() { heap = new Heap<>(); }
    public PriotityQueue(bool minh) { heap = new Heap<>(minh); }
    
    public void enqueue() { heap.insert(element); }
    public T dequeue() { return heap.delete(); }
    public T peak() { return heap.peak(); }
    public int size() {return heap.size(); }
    public boolean isEmpty() { return heap.isEmpty();
    
    public boolean contains(T elem) {
        for (int i = 0; i < heap.size(); i++) {
            if (heap.heap[i].equals(elem)) return true;
        }
        return false;
    }
    
    public void remove(T elem) {
        int ind = -1;
        for (int i = 0; i < heap.size(); i++) {
            if (heap.heap[i].equals(elem)) {
                ind = i;
                break;
            }
        }
        if (ind != -1) {
            T last = heap.delete();
            if (ind < heap.size()) {
                heap.heap[ind] = last;
                heap.sink(ind);
                heap.swim(ind);
            }
        }
    }
}
