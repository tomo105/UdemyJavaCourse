package DuckThinkFirst;

public class DucksSimulator {
    public static void main(String[] args) {
        Duck m = new Mallard();
        m.display();
        m.performFly();
        m.performQuack();
    }
}
