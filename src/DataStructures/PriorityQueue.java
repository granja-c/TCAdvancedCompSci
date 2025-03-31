package DataStructures;

public class PriorityQueue<T extends Comparable<T>> {
    private final Heap<T> heap;

    public PriotityQueue() { heap = new Heap<>(); }
    public PriotityQueue(boolean minh) { heap = new Heap<>(minh); }
    
    public void enqueue(T element) { heap.insert(element); }
    public T dequeue() { return heap.delete(); }
    public T peek() { return heap.peek(); }
    public int size() {return heap.size(); }
    public boolean isEmpty() { return heap.isEmpty(); }
    
    public boolean contains(T element) {
        for (int i = 0; i < heap.size(); i++) {
            if (heap.heap[i].equals(element)) return true;
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
//    public boolean contains(T element) {
//        int ind = -1;
//        for (int i = 0; i < heap.size(); i++) {
//            if (heap.heap[i].equals(element)) {
//                ind = i;
//                break;
//            }
//        }
//        return ind != -1;
//    }

    public void changePriority(T element, T newPriority) {
        int ind = -1;
        for (int i = 0; i < heap.size(); i++) {
            if (heap.heap[i].equals(element)) {
                ind = i;
                break;
            }
        }
        if (ind != -1) {
            heap.heap[ind] = newPriority;
            if (heap.compare(element, newPriority) < 0) heap.sink(ind);
            else heap.swim(ind);
        }
    }
}
