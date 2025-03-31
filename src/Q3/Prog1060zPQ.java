package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import DataStructures.PriorityQueue;

class Job implements Comparable<Job> {
    public int job;
    public char priority;

    public Job(int jobn, char pr) {
        job = jobn;
        priority = pr;
    }

    public String toString() { return priority + "" + job; }
    public int compareTo(Job o) {
        if (this.priority > o.priority) return Character.compare(priority, o.priority);
        else return Integer.compare(job, o.job);
    }
}



public class Prog1060zPQ {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prg1060z.dat"));
            var pq = new PriorityQueue<Job>(true);
            while (sc.hasNext()) {
                String info = sc.next();
                char comm = info.charAt(0);
                if (comm == 'W') {}
                else if (comm == 'P') {}
                else {
                    char priority = info.charAt(1);
                    int job = Integer.parseInt(info.substring(2));
                    pq.enqueue(new Job(job, priority));
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
