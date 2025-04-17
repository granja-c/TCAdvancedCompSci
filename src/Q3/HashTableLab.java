package Q3;
import java.util.LinkedList;

public class HashTableLab {
    static abstract class HashTable<T> {
        protected LinkedList<T>[] table;
        @SuppressWarnings("unchecked")
        public HashTable(int size) {
            table = new LinkedList[size];
            for (int i = 0; i < size; i++)
                table[i] = new LinkedList<>();
        }
        protected abstract int hash(T key);

        public void insert (T key) {
            int ind = hash(key);
            if (!table[ind].contains(key)) table[ind].add(key);
        }
        public boolean search(T key) {
            int ind = hash(key);
            return table[ind].contains(key);
        }
        public void display(){
            for (int i = 0; i < table.length; i++)
                System.out.println(i + ": " + table[i]);
        }
    }

    static class IntHashTable extends HashTable<Integer> {
        public IntHashTable(int size) { super(size); }
        protected int hash(Integer key) { return Math.abs(key) % table.length; }
    }
    static class StringHashTable extends HashTable<String> {
        public StringHashTable(int size) { super(size); }
        protected int hash(String key) {
            int hash = 0;
            for (char c : key.toCharArray()) {
                hash = (hash*31+c) % table.length;
            }
            return hash;
        }
    }
    public static void main(String[] args) {
        System.out.println("int");
        var itb = new IntHashTable(5);
        itb.insert(10);
        itb.insert(15);
        itb.insert(20);
        itb.insert(5);
        itb.insert(30);
        itb.display();
        System.out.print("50?" + itb.search(50));
        System.out.print("20?" + itb.search(20));

        var stb = new StringHashTable(5);
        stb.insert("apple");
        stb.insert("banana");
        stb.insert("grape");
        stb.insert("mango");
        stb.insert("orange");
        stb.display();
        System.out.print("Apple?" + stb.search("apple"));
        System.out.print("Tomato?" + stb.search("tomato"));

    }



}