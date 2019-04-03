package MasterChallenge;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe", "Bacon", 15.3, "black");
        super.addCheese("chips", 3.2);
        super.addTomato("drinks", 2.3);
    }


    @Override
    public void addCheese(String name, double cost) {
        System.out.println("can not have addiotion to this burger");
    }

    @Override
    public void addOnion(String name, double cost) {
        System.out.println("can not have addiotion to this burger");
    }

    @Override
    public void addTomato(String name, double cost) {
        System.out.println("can not have addiotion to this burger");
    }

    @Override
    public void addEggs(String name, double cost) {
        System.out.println("can not have addiotion to this burger");
    }


}
