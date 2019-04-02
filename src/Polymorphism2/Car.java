package Polymorphism2;

public class Car {
    private String name;
    private boolean hasEngine;
    private int cylinders;
    private int wheels;


    public Car(String name, int cylinders) {
        this.name = name;
        this.hasEngine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car engine started";
    }

    public String accelerate() {
        return "Car accelerate";
    }

    public String brake() {
        return "Car break.";
    }

}
