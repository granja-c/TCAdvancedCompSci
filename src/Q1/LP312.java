package Q1;
import Utils.Console;

public class LP312 {
    static class ClLP312 {
        private double[] exp;
        private double[] percb;
        public ClLP312(double[] ex) {
            exp = ex;
            calc();
        }
        private void calc() {
            double tot = 0;
            for (double e : exp) tot += e;
            percb = new double[exp.length];
            for (int i = 0; i < exp.length; i++) {
                percb[i] = exp[i] / tot * 100;
            }
        }

        public double[] getPercb() {
            return percb;
        }
    }
    public static void main(String[] args) {
        double food = Console.input("Food: ");
        double rent = Console.input("Rent: ");
        double clothing = Console.input("Clothing: ");
        double entertainment = Console.input("Entertainment: ");
        double[] expenses = {food, rent, clothing, entertainment};
        ClLP312 help = new ClLP312(expenses);
        double[] percent = help.getPercb();
        System.out.printf("Food: %.2f%%\n", percent[0]);
        System.out.printf("Rent: %.2f%%\n", percent[1]);
        System.out.printf("Clothing: %.2f%%\n", percent[2]);
        System.out.printf("Entertainment: %.2f%%\n", percent[3]);


    }
}
/*
Food: 350.
Rent: 300.
Clothing: 200.
Entertainment: 1250.
Food: 16.67%
Rent: 14.29%
Clothing: 9.52%
Entertainment: 59.52%

Process finished with exit code 0

 */