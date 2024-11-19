package example;

public class Circle {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        final double DIAMETER = 10.0;
        double area = calculateArea(DIAMETER / 2);

        System.out.println(area);
    }
}
