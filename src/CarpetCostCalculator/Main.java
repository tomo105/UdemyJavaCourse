package CarpetCostCalculator;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(4,25);
        Carpet carpet = new Carpet(3);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println(calculator.getTotalcost());
    }
}
