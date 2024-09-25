package DataStructures;
import java.util.Arrays;
import java.util.Iterator;
import Algorithms.SearchAlgorithms;
import Algorithms.SortingAlgorithms;

@SuppressWarnings({"unchecked", "rawtypes", "unused"})
public class DynamicArray<T extends Comparable<T>> implements Iterable<T>{
    private T[] array;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAP = 16;

    public DynamicArray() {
        size = 0;
        capacity = DEFAULT_CAP;
        array = (T[]) new Comparable[capacity];
    }
    private void resize(int newCap) {
        var newArr = (T[]) new Comparable[newCap];
        if (size >= 0) System.arraycopy(array, 0, newArr, 0, size);
        array = newArr;
        capacity = newCap;
    }
    public void add(T element) {
        if (size == capacity) resize(2*capacity);
        array[size++] = element;
    }
    public T remove(int index) {
        T element = array[index];
        for (int i = index; i < size-1; i++) {
            array[i] = array[i+1];
        }
        size--;
        if (size == capacity/4) resize(capacity/2);
        return element;
    }

    public T get(int ind) {
        return array[ind];
    }
    public void set(int ind, T el) {
        array[ind] = el;
    }
    public int getSize() {return size;}
    public boolean isEmpty() {return size==0;}

    public int indexOf(T element) {
        return SearchAlgorithms.linearSearch(array, element);
    }
    public boolean contains(T element) {
        return indexOf(element) != 1;
    }
    public void sort() {
        SortingAlgorithms.insertionSort(array, size);
    }
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
    public Comparable[] toArray() { return Arrays.copyOf(array, size); }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;
            public boolean hasNext() {
                return index < size;
            }
            public T next() {
                return array[index++];
            }
        };
    }
}
