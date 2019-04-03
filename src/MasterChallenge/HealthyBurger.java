package MasterChallenge;

public class HealthyBurger extends Burger {
    private String salad;
    private double saladPrice;

    private String bekon;
    private double bekonPrice;

    public HealthyBurger(String meat, double price) {

        super("Healthy", meat, price, "Brown rye");
    }

    public void addBekon(String name, double cost) {
        this.bekon = name;
        this.bekonPrice = cost;
    }

    public void addSalad(String name, double cost) {
        this.salad = name;
        this.saladPrice = cost;
    }

    @Override
    public double CostBurger() {
        double burgerprice = super.CostBurger();
        if (this.salad != null)
            burgerprice += this.saladPrice;
        if (this.bekon != null)
            burgerprice += this.bekonPrice;
        return burgerprice;
    }
}
