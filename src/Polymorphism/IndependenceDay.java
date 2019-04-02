package Polymorphism;

public class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Indepenence Day");
    }

    @Override
    public String plot() {
        return "Alients attempt to take over planet Earth ";
    }

}
