package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Student {
    private String first;
    private String last;
    private int[] grades;
    private double avg;
    private String letter;

    public Student(String fn, String ln, int[] gs) {
        first = fn;
        last = ln;
        grades = gs;
        avg = 0;
    }
    public void calcGrade() {
        for (int i : grades) {
            avg += i;
        }
        avg /= grades.length;
    }
    public String toString() {
        return String.format(first + " " + last + "\t%d\t%d\t%d\t%d\t%d\t%d", );
    }
}
public class Prog505b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog505.txt"));

            while (sc.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
