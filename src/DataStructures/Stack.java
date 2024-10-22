package DataStructures;

@SuppressWarnings("unchecked")
public class Stack <T extends Comparable<T>>{
    private T[] stack;
    private int size;
    private int capacity;
    public Stack() {

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


    public boolean isEmpty() { return size == 0;}
    public T peek() { return stack[size--]; }



}
