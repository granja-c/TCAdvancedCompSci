package Q1.Prog285b;

public class Cl285b implements Comparable<Cl285b> {
    private int id;
    private int code;
    private double sales;
    private double comm;

    private void calc() {
        if (code == 5 || code == 8) {
            if (sales > 5000) comm = 5000 * 0.075 + (sales-5000) * 0.085;
            else comm = sales * 0.075;
        } else {
            if (sales > 3500) comm = 3500 * 0.095 + (sales-3500) * 0.12;
            else comm = sales * 0.095;
        }
    }

    public Cl285b(int id, int code, double sales) {
        this.id = id;
        this.code = code;
        this.sales = sales;
        this.comm = 0;
        calc();
    }

    public String toString() {
        return String.format("%d\t%d\t\t$%.2f\t$%.2f", id, code, sales, comm);
    }

    public int compareTo(Cl285b o) {
        return id - o.id;
    }
}