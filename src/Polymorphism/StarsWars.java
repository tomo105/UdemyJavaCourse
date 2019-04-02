package Polymorphism;

public class StarsWars extends Movie {
    public StarsWars() {
        super("Stars Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}
