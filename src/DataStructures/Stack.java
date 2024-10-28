package DataStructures;

@SuppressWarnings("unchecked")
public class Stack <T extends Comparable<T>>{
    private T[] stack;
    private int size;
    private int capacity;
    public Stack() {
        size = 0;
    }
    public void resize(int cap) {
        if (cap < 1) cap = 1;
        T[] newS = (T[]) new Comparable[cap];
        System.arraycopy(stack, 0, newS, 0, size);
        stack = newS;
        capacity = cap;
    }
    public void push(T element) {
        if (size == capacity) resize(capacity * 2);
        stack[size++] = element;
    }
    public T pop() {
        T element = stack[--size];
        if (size == capacity / 4) resize(capacity / 2);
        return element;
    }

    public boolean isEmpty() { return size == 0;}
    public T peek() { return stack[size--]; }



}
