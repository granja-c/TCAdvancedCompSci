package Q2.Prog602b;

public class Cl602b {
    public int acc;
    public double hours;
    public int code;
    public double charge;

    public Cl602b(int num, double hrs, int cd) {
        acc = num;
        hours = hrs;
        code = cd;
        calc();
    }

    public void calc() {
        if (hours >= 5) charge = 200;
        else if (hours >= 15) charge = 200 + (hours-5) * 50;
        else charge = 550 + (hours - 15) * 30;
        if (code == 1) charge += 50;
        if (code == 2) charge += 150;
    }

    public void print() {
        System.out.println(acc + "\t" + hours + "\t" + code + "\t" + charge);
    }
}
