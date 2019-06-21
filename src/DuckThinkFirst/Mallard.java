package DuckThinkFirst;

public class Mallard extends Duck {

    public Mallard() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard \n I can't fly but i am cute");
    }
}
