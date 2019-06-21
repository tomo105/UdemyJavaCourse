package DuckThinkFirst;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;//instance of interface  not specific type !!! very usefulK

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();   //zalezne od behaviour nie musuimy wuedzuec jakie
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("i can swim ");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
