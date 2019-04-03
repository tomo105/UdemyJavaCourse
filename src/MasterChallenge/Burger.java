package MasterChallenge;

public class Burger {
    private String name;
    private String meat;
    private double price;
    private String BreadRollType;

    private String cheese;
    private double cheesePrice;

    private String onion;
    private double onionPrice;

    private String eggs;
    private double eggsPrice;

    private String tomato;
    private double tomatoPrice;

    public Burger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        BreadRollType = breadRollType;
    }

    public void addCheese(String name, double cost) {

        this.cheese = name;
        this.cheesePrice = cost;
    }

    public void addOnion(String name, double cost) {
        this.onion = name;
        this.onionPrice = cost;
    }

    public void addTomato(String name, double cost) {

        this.tomato = name;
        this.tomatoPrice = cost;
    }

    public void addEggs(String name, double cost) {
        this.eggs = name;
        this.eggsPrice = cost;
    }

    public double CostBurger() {
        double priceBurger = this.price;
        System.out.println("basic price of hamburger is: " + priceBurger);
        if (this.tomato != null) {
            priceBurger += this.tomatoPrice;
            System.out.println("add " +tomato);
        }
        if (this.eggs != null) {
            priceBurger += this.eggsPrice;
            System.out.println("add " +eggs);
        }
        if (this.cheese != null) {
            priceBurger += this.cheesePrice;
            System.out.println("add " + cheese);
        }
        if (this.onion != null) {
            priceBurger += this.onionPrice;
            System.out.println("add " + onion);
        }
        return priceBurger;
    }
}
