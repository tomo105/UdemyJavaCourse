package Inheritance.Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double heigth) {
        super(radius);
        if (heigth < 0)
            this.height = 0;
        else
            this.height = heigth;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
