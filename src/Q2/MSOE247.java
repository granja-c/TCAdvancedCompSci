package Q2;
import java.util.*;

public class MSOE247 {
    static class gift {
        String name;
        double wid;
        double len;
        double hei;
        double vol;
        public gift(String na, double wi, double le,double hi) {
            name = na;
            wid = wi;
            len = le;
            hei = hi;
            vol = len * wid * hei;
        }
        public void print() {
            System.out.print(name + ": " + wid + "x" + len + "x" + hei);
        }
        public double getVol(){
            return vol;
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
        str = input.nextLine();
        while (!str.equals("ignore 0x0x0")) {
            int sp = 0;
            for (int i = 0; i < str.length(); i++) {
                if (!str.substring(i, i+1).equals(" ")) {
                    n += str.substring(i, i+1);
                }
                if (str.substring(i, i+1).equals(" ")) {
                    sp = i+1;
                    i = str.length();
                }
            }
            System.out.println(n);
            int sp2 = 0;
            for (int i = sp; i < str.length(); i++) {
                if (!str.substring(i, i+1).equals("x") && !str.substring(i, i+1).equals(" ")) {
                    w += str.substring(i, i+1);
                }
                if (str.substring(i, i+1).equals("x")) {
                    sp2 = i+1;
                    i = str.length();
                }
            }
            System.out.println(w);
            int sp3 = 0;
            for (int i = sp2; i < str.length(); i++) {
                if (!str.substring(i, i+1).equals("x")) {
                    l += str.substring(i, i+1);
                }
                if (str.substring(i, i+1).equals("x")) {
                    sp3 = i+1;
                    i = str.length();
                }
            }
            System.out.println(l);
            h = str.substring(sp3);
            System.out.println(h);
            double width = Double.parseDouble(w);
            double leng = Double.parseDouble(l);
            double height = Double.parseDouble(h);
            var g = new gift(n, width, leng, height);
            for (int i = 0; i < list.size(); i++) {
                if (g.getVol() > list.get(i).getVol()) {
                    list.add(i, g);
                }
            }
            list.add(g);

            n = "";
            w = "";
            l = "";
            h = "";
            str = input.nextLine();
        }

        list.get(0).print();

        ArrayList<ArrayList<gift>> gifts = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

        }













//        var g1 = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            var g2 = list.get(i);
//            if (g1.hei-g2.hei >= 1) {
//                if ((g1.wid-g2.wid >= 1 && g1.len-g2.len >= 1) || (g1.wid-g2.len >= 1 && g1.len-g2.wid >= 1)) {
//                    System.out.print(", ");
//                    g2.print();
//                }
//            } else {
//                System.out.print("\n");
//                g2.print();
//            }
//            g1 = g2;
//        }
    }
}
