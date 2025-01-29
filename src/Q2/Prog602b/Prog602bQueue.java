//package Q2.Prog602b;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.*;
//import DataStructures.Queue;
//
//public class Prog602bQueue {
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(new File("Langdat/prog602b.dat"));
//            var accs = new Queue<Cl206b>();
//            while (sc.hasNext()) {
//                int n = sc.nextInt();
//                double h = sc.nextDouble();
//                int c = sc.nextInt();
//                Cl602b cus = new Cl602b(n, h, c);
//                accs.enqueue(cus);
//            }
//            while (!accs.isEmpty()) {
//                System.out.print(accs.dequeue());
//            }
//
//        } catch (IOException e) {
//            System.out.println("Can't find data file");
//        }
//    }
//}
