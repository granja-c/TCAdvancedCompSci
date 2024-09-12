package Q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String first;
    private String last;
    public int[] grades;
    private double avg;
    private String letter;

    public Student(String fn, String ln, int[] gs) {
        first = fn;
        last = ln;
        grades = new int[5];
        letter = "N/A";
        calcGrade();
    }

    public void calcGrade() {
        for (int i : grades) {
            avg += i;
        }
        avg /= grades.length;
        if (avg >= 90) letter = "A";
        else if (avg >= 80) letter = "B";
        else if (avg >= 70) letter = "C";
        else if (avg >= 60) letter = "D";
        else letter = "F";

    }
    public String toString() {
        return String.format("%s %s\t%d\t%d\t%d\t%d\t%d\t%.2f %s", first, last, grades[0],grades[1],grades[2],grades[3],grades[4], avg, letter);
    }
}
public class Prog505b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog505b.txt"));
            var kids = new ArrayList<Student>();

            while (sc.hasNext()) {
                String fn = sc.next();
                String ln = sc.next();
                int[] gs = new int[5];
                for (int i = 0; i < 5; i++) {
                    gs[i] = sc.nextInt();
                }
                Student girl = new Student(fn, ln, gs);
                kids.add(girl);
            }

            for (int i = 0; i < kids.size(); i++) {
                System.out.println(kids.get(i));
            }
            double[] testavg = new double[5];
            for (int i = 0; i < 5; i++) {
                double a = 0;
                a += (kids.get(0).grades[i] + kids.get(1).grades[i] + kids.get(2).grades[i]) / 5;
                System.out.println("Test " + (i+1) + "\t" + a);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
