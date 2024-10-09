package Q1;

import DataStructures.IntLinkedList;

public class BigLinkedList {
    public static void main(String[] args) {
        var list = new IntLinkedList();
        for (int i = 0; i < 200; i++)
            list.addFront((int)(Math.random() * 100 + 1));


        list.print();
        System.out.println();
        list.addFront(1);
        list.print();
        System.out.println();
        list.addLast(1);
        list.print();
        System.out.println();
        System.out.println(list.getCount());
        list.add(1, 1);
        list.print();
        System.out.println();

        System.out.println(list.isEmpty());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getByIndex(1));
        list.removeFirst();
        list.removeLast();
        list.print();

        System.out.println(list.countLessTen());
        list.removeByIndex(1);
        list.print();

        System.out.println(list.contains(1));

//        // list.reverse().print();
//        System.out.println(list.avg());
//        System.out.println(list.getMin());
//        System.out.println(list.getMax());
//        System.out.println(list.getMaxIndex());
//        System.out.println(list.getLastMaxInd());
//        //list.sort();
//        list.print();
//        System.out.println(list.remove58());
//        list.print();
//        System.out.println(list.evenCount());
//        System.out.println(list.removeOdds());
//        list.print();
//        list.clear();
    }
}
