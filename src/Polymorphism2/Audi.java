package Polymorphism2;

public class Audi extends Car{
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Audi engine started";
    }

    @Override
    public String accelerate() {
        return "Audi accelerate";
    }

    @Override
    public String brake() {
        return "Audi break.";
    }
}
