package Q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog705x {
    public static void main(String[] args) {
        try {
            Scanner sc1 = new Scanner(new File("Langdat/prog512h.dat"));
            Scanner sc2 = new Scanner(new File("Langdat/prog705x.txt"));
            var poem = new ArrayList<String>();
            var code = new ArrayList<String>();
            String res = "";
            while (sc1.hasNext()) {
                String line = sc1.nextLine();
                poem.add(line);
            }
            while (sc2.hasNext()) {
                String n = sc2.nextLine();
                code.add(n);
            }
            for (var c : code) {
                int l = Integer.parseInt(c.substring(0, 2))-1;
                int w = Integer.parseInt(c.substring(2,3))-1;
                int let = Integer.parseInt(c.substring(3))-1;
                String[] line = poem.get(l).split(" ");
                char letter = line[w].charAt(let);
                res += letter;
                System.out.println(c + "\t" + letter);
            }
            System.out.println(res);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
0831	c
0112	o
0722	o
0914	l
0821	b
1243	e
1551	a
1724	n
1816	s
coolbeans
 */