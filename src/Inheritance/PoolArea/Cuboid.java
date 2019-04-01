package Inheritance.PoolArea;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double heigth) {
        super(width, length);
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
