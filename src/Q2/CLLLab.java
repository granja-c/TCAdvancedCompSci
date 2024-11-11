package Q2;
import DataStructures.CircularLL;

public class CLLLab {
    public static void main(String[] args) {
        var list = new CircularLL<Integer>();
        System.out.println("Starting size: " + list.size());
        list.add(5);
        list.add(7);
        list.add(13);
        System.out.println("Ending size: " + list.size());

        list.print();

        list.remove(1);
        list.print();

        try {
            list.remove(6403298);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No such index.");
        }
        for (var x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
