package DataStructures;
import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class Set<T extends Comparable<T>> implements Iterable<T> {
    protected static final int DEFAULT_CAPACITY = 16;
    protected static final double DEFAULT_LOAD_FACTOR = 0.75;

    protected static class Entry<T> {
        public T key;
        Entry<T> next;

        Entry(T key) {
            this.key = key;
            this.next = null;
        }

        public int hashCode() { return key.hashCode(); }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            Entry<?> entry = (Entry<?>) o;
            return key.equals(entry.key);
        }
    }

    protected Entry<T>[] table;
    protected int size;

    public Set(int capacity) {
        table = new Entry[capacity];
        size = 0;
    }
    public Set() {
        this(DEFAULT_CAPACITY);
    }

    protected int getIndex(T key) {
        return (key.hashCode() & 0x7fffffff) % table.length;
    }
    protected void resize(int newCap) {
        Entry<T>[] newtable = new Entry[newCap];
        for (Entry<T> entry : table) {
            var curr = entry;
            while (curr != null) {
                Entry<T> next = curr.next;
                int index = (curr.key.hashCode() & 0x7fffffff) & newCap;
                curr.next = newtable[index];
                newtable[index] = curr;
                curr = next;
            }
        }
        table = newtable;
    }

    public void insert (T key) {
        if (contains(key)) return;
        if (size >= table.length * DEFAULT_LOAD_FACTOR) resize(2 * table.length);
        int ind = getIndex(key);
        Entry<T> entry = new Entry<>(key);
        if (table[ind] == null) table[ind] = entry;
        else {
            Entry<T> curr = table[ind];
            while (curr.next != null) curr = curr.next;
            curr.next = entry;
        }
        size++;
    }

    public boolean contains(T key) {
        Entry<T> curr = table[getIndex(key)];
        while (curr != null) {
            if (curr.key.equals(key)) return true;
            curr = curr.next;
        }
        return false;
    }
}
