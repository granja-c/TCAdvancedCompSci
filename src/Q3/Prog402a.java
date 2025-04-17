package Q3;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Person {
    int id;
    int score;
    Person(int i, int s) {
        id = i;
        score = s;
    }
}
public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prg402a.txt"));
            Set<Person> set = new HashSet<>();

            while (sc.hasNext()) {
                set.add(new Person(sc.nextInt(), sc.nextInt()));
            }

            double avg = 0;
            Iterator iter = set.iterator();
            while (iter.hasNext()) {
                Person p = (Person)iter.next();
                avg += p.score;
            }
            avg /= set.size();
            iter = set.iterator();
            System.out.println("ID\tScore\tDifference");
            while (iter.hasNext()) {
                Person p = (Person)iter.next();
                System.out.println(p.id + "\t" + p.score + "\t" + (p.score - avg));
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
