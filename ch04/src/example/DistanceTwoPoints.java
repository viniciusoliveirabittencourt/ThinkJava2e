package example;

public class DistanceTwoPoints {
    /*
    Demonstration of step-by-step development
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println(dx);
        System.out.println(dy);
        double dsquared = dx * dy + dy * dx;
        System.out.println(dsquared);
        return Math.sqrt(dsquared);
    }

    public static void main(String[] args) {
        double dist = distance(1.0, 2.0, 4.0, 6.0);
        System.out.println(dist);
    }
}
