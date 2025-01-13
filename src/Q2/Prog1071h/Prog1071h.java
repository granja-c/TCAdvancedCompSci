package Q2.Prog1071h;
import DataStructures.QStack;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog1071h {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/bginvtry.txt"));
            QStack<Double>[] qs = new QStack[10];
            int c = 0;
            int num = 0;
            double val = 0;

            while (sc.hasNext()) {
                c = sc.nextInt();
                System.out.print(c + "\t");
                num = sc.nextInt();
                System.out.print(num + "\t");
                val = sc.nextDouble();
                System.out.print(val + "\t");
                for (int i = 0; i < num; i++) {
                    if (qs[c-1] == null) qs[c-1] = new QStack<Double>();
                }
                qs[c-1].push(val);
            }
            System.out.println();

            sc = new Scanner(new File("Langdat/buysell.txt"));
            String let = "";
            while (sc.hasNext()) {
                let = sc.next();
                c = sc.nextInt();
                num = sc.nextInt();
                if (let.equals("S")) {
                    for (int i = 0; i < num; i++) {
                        qs[c-1].pop();
                    }
                } else if (let.equals("B")) {
                    val = sc.nextDouble();
                    for (int i = 0; i < num; i++) {
                        qs[c-1].push(val);
                    }
                }
            }

            int lc = 0;
            int count = 0;
            double v = 0;
            for (int i = 0; i < qs.length; i++) {
                lc = qs[i].size();
                count = 1;
                val = qs[i].peek();
                qs[i].pop();
                for (int j = 1; j < lc; j++) {
                    if (qs[i].peek() != v) {
                        System.out.println((i+1) + "\t" + count + "\t" + val);
                        count = 0;
                    }
                    v = qs[i].peek();
                    count++;
                    qs[i].pop();
                }
                System.out.println((i+1) + "\t" + count + "\t" + val);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}