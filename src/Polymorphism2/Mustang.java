package Polymorphism2;

public class Mustang extends Car {
    public Mustang(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "start Engine";

    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "break.";
    }
}
