package DataStructures;

public class LLStack<T extends Comparable<T>> {
    private final LinkedList<T> stack;

    public LLStack() { stack = new LinkedList<>(); }

    public void push(T element) { stack.add(element); }
    public T pop() { return stack.remove(stack.size()-1); }
    public T peek() { return stack.get(stack.size()-1); }
    public int size() { return stack.size(); }
    public boolean isEmpty() { return stack.isEmpty(); }

}
