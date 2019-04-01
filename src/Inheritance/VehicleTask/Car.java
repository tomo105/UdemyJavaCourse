package Inheritance.VehicleTask;

public class Car extends Vehicle {
    private int wheels;
    private int gears;
    private int doors;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int gears, int doors, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("set current and change to " + currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("change velocity " + speed + "direction " + direction);
        move(speed, direction);
    }

}
