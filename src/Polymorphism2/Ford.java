package Polymorphism2;

public class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford engine started";
    }

    @Override
    public String accelerate() {
        return "Ford accelerate";
    }

    @Override
    public String brake() {
        return "ford break.";
    }
}
