package Q1;

import Utils.Console;

public class Prog82a {
    static class Cl82a {
        private int lim;
        private int speed;
        private double fine;
        private static final int BASE = 20;

        public Cl82a(int l, int s) {
            lim = l;
            speed = s;
        }
        public void calc() {
            if (speed > lim)
                fine = BASE + (speed - lim) * 5;
        }

        public double getFine() {
            return fine;
        }
    }
    public static void main(String[] args) {
        int limit = Console.input("Enter the speed limit: ");
        int speed = Console.input("Enter the vehicle speed: ");
        var tick = new Cl82a(limit, speed);
        tick.calc();
        System.out.printf("Fine: $%.2f", tick.getFine());
    }
}
/*
Enter the speed limit: 20
Enter the vehicle speed: 50
Fine: $170.00
Process finished with exit code 0
 */