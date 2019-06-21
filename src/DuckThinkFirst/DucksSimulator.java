package DuckThinkFirst;

public class DucksSimulator {
    public static void main(String[] args) {
        Duck m = new Mallard();
        m.display();

        m.performFly();
        m.setFlyBehaviour(new FlyRocketSpeed());
        m.performFly();

        m.performQuack();
    }
}
