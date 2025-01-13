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
    }

    public static void main(String[] args) {
        var list = new ArrayList<gift>();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String n = "";
        String w = "";
        String l = "";
        String h = "";
        while (!str.equals("ignore 0x0x0")) {
            int sp = 0;
            for (int i = 0; i < str.length(); i++) {
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
            for (int i = sp; i < str.length(); i++) {
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
            for (int i = sp2; i < str.length(); i++) {
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
            System.out.println(h);
            double width = Double.parseDouble(w);
            double leng = Double.parseDouble(l);
            double height = Double.parseDouble(h);
            var g = new gift(n, width, leng, height);
            list.add(g);
            str = input.nextLine();
        }

        list.get(0).print();


        for (int i = 1; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).vol < list.get(i).vol) {
                    var x = list.get(j);
                    list.remove(j);
                    list.add(i-1, x);
                    j--;
                }
            }
        }

        ArrayList<ArrayList<gift>> gifts = new ArrayList<ArrayList<gift>>();
        for (int i = 0; i < list.size()-1; i++) {
            var lg = new ArrayList<gift>();
            var cg = list.get(i);
            lg.add(cg);
            for (int j = i+1; j < list.size(); j++) {
                if (cg.vol / list.get(j).vol >= 1.55 && cg.vol / list.get(j).vol <= 1.65) {
                    lg.add(list.get(j));
                    cg = list.get(j);
                }
            }
            gifts.add(lg);
        }
        int m = gifts.get(0).size();
        int ind = 0;
        for (int i = 0; i < gifts.size(); i++) {
            if (gifts.get(i).size() > m) {
                m = gifts.get(i).size();
                ind = i;
            } else if (gifts.get(i).size() == m) {
                if (gifts.get(i).get(0).vol > gifts.get(ind).get(0).vol) {
                    m = gifts.get(i).size();
                    ind = i;
                }
            }
        }
        gifts.get(ind).get(0).print();
    }
}
