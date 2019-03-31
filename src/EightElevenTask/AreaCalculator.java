package EightElevenTask;

public class AreaCalculator {
    public double area(double radius) {
        if (radius < 0)
            return -1;
        System.out.println(radius*radius*Math.PI);
        return Math.PI * radius * radius;
    }

    public double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1;
        System.out.println(x*y);
        return x * y;
    }
}
