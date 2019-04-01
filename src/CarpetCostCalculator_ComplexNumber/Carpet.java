package CarpetCostCalculator_ComplexNumber;

public class Carpet {
    private double cost;

    Carpet(double cost) {
        if (cost < 0)
            this.cost = 0;
        else
            this.cost = cost;
    }
     double getCostValue() {
        return cost;
    }
}
