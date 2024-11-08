package Q2.Prog602b;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog602b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog602b.dat"));
            Stack<Cl602b> accs = new Stack<>();
            while (sc.hasNext()) {
                int n = sc.nextInt();
                double h = sc.nextDouble();
                int c = sc.nextInt();
                Cl602b cus = new Cl602b(n, h, c);
                accs.push(cus);
            }
            while (!accs.isEmpty()) {
                accs.pop().print();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
