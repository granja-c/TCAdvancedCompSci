package Q2;
import java.util.*;

public class MSOE247 {
    static class gift {
        String name;
        double wid;
        double len;
        double hei;
        public gift(String na, double wi, double le,double hi) {
            name = na;
            wid = wi;
            len = le;
            hei = hi;
        }
        public void print() {
            System.out.print(name + ": " + wid + "x" + len + "x" + hei);
        }
    }
    public static void main(String[] args) {
        var list = new ArrayList<gift>();
        Scanner input = new Scanner(System.in);
        String str = "";
        String n = "";
        String w = "";
        String l = "";
        String h = "";
        while (!str.equals("ignore 0x0x0")) {
            str = input.nextLine();
            int sp = 0;
            for (int i = 0; i < str.length(); i++) { //name
                if (!str.substring(i, i+1).equals(" ")) {
                    n += str.substring(i, i+1);
                }
                if (str.substring(i, i+1).equals(" ")) {
                    sp = i;
                    i = str.length();
                }
            }
            System.out.println(n);
            int sp2 = 0;
            for (int i = sp; i < str.length(); i++) { //wid
                if (!str.substring(i, i+1).equals("x") && !str.substring(i, i+1).equals(" ")) {
                    w += str.substring(i, i+1);
                }
                if (str.substring(i, i+1).equals("x")) {
                    sp2 = i;
                    i = str.length();
                }
            }
            System.out.println(w);
            int sp3 = 0;
            for (int i = sp2; i < str.length(); i++) { //len
                if (!str.substring(i, i+1).equals("x")) {
                    l += str.substring(i, i+1);
                }
                if (str.substring(i, i+1).equals("x")) {
                    sp3 = i;
                    i = str.length();
                }
            }
            System.out.println(l);
            h = str.substring(sp3);
            // for (int i = sp3; i < str.length(); i++) { //height FIX
            //     if (!str.substring(i, i+1).equals("x")) {
            //         h += str.substring(i, i+1);
            //     }
            //     if (str.substring(i, i+1).equals(" ")) {
            //         i = str.length();
            //     }
            // }
            System.out.println(h);
            double width = Double.parseDouble(w);
            double leng = 13.0;
            double height = Double.parseDouble(h);
            var g = new gift(n, width, leng, height);
            list.add(g);
        }
        // Double.valueOf(l)

        list.get(0).print();
        var g1 = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            var g2 = list.get(i);
            if (g1.hei-g2.hei >= 1) {
                if ((g1.wid-g2.wid >= 1 && g1.len-g2.len >= 1) || (g1.wid-g2.len >= 1 && g1.len-g2.wid >= 1)) {
                    System.out.print(", ");
                    g2.print();
                }
            } else {
                System.out.print("\n");
                g2.print();
            }
            g1 = g2;
        }
    }
}
