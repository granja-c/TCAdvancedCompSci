package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class cont {
    double[] scores;
    double score;
    cont(double[] scores) {
        this.scores = scores;
        score = calc();
    }
    private double calc() {
        double sum = 0;
        for (double s : scores) sum += s;
        return sum / scores.length;
    }
}

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog215h.txt"));
            var l = new ArrayList<cont>();
            while (sc.hasNext()) {
                double[] scores = new double[8];
                for (int i = 0; i < 8; i++) {
                    double s = sc.nextDouble();
                    System.out.print(s + " ");
                    scores[i] = s;
                }
                cont c = new cont(scores);
                System.out.print(" = " + c.score + "\n");
                l.add(c);
            }
            int ind = -1;
            double m = -1;
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).score > m) {
                    m = l.get(i).score;
                    ind = i;
                }
            }
            System.out.println("Contestant " + (ind+1) + " wins!");

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
