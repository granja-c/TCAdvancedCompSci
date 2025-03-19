//package Q1;
//
//import DataStructures.DoublyLinkedList;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Prog1061h {
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(new File("Langdat/prg1061h.dat"));
//
//            // String[] coms = {"P", "A", "D"};
//            var list = new DoublyLinkedList<String>();
//            while (sc.hasNext()) {
//                String word = sc.next();
//                if (word.substring(0, 1).equals("P")) list.print();
//                else if (word.substring(0, 1).equals("A")) list.addSorted(word.substring(1));
//                else {
//                    for (int i = 0; i < list.size(); i++) {
//                        if (list.get(i).equals(word.substring(1))) {
//                            if (i == 0) list.removeFirst();
//                            else list.remove(i);
//                        };
//                    }
//                }
//            }
//
//        } catch (IOException e) {
//            System.out.println("Can't find data file");
//        }
//    }
//}
