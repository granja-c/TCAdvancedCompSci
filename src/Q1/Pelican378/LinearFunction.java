package Q1.Pelican378;

public class LinearFunction implements LinearFunctionMethods {
    double slope;
    double yint;

    public LinearFunction(double sl, double yi) {
        slope = sl;
        yint = yi;
    }

    public double getSlope() {
        return slope;
    }
    public double getYint() {
        return yint;
    }
    public double getRoot() {
        double r = (0 - yint) / slope;
        return r;
    }

    public double getXval(double y) {
        double x = (y - yint) / slope;
        return x;
    }
    public double getYval(double x) {
        double y = slope * x + yint;
        return y;
    }

}
