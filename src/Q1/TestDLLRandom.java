package Q1;
import DataStructures.DoublyLinkedList;

public class TestDLLRandom {
    public static void main(String[] args) {
        var list = new DoublyLinkedList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random() * 100));
        }
        list.print();
        list.printReverse();
        list.addFront(1);
        list.print();
        list.insert(1, 1);
        list.print();
        list.remove(2);
        list.print();
        System.out.println(list.get(1));
        list.set(1, 5);
        list.print();

    }
}
