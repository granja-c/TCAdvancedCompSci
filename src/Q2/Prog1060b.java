package Q2;
import java.util.*;

public class Prog1060b {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        while (!l.equals("e")) {
            if (l.equals("a")){
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                queue.add(num);
            }
            if (l.equals("d")) {
                System.out.println(queue.remove());
            }

            System.out.println("Current queue: " + queue);
            l = sc.next();
        }
    }
}
