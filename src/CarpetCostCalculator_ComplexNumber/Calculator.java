package CarpetCostCalculator_ComplexNumber;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
     double getTotalcost() {
        return floor.getArea()*carpet.getCostValue();
    }
}
