package CarpetCostCalculator_ComplexNumber;

public class Main {
    public static void main(String[] args) {

        Floor floor = new Floor(4,25);
        Carpet carpet = new Carpet(3);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println(calculator.getTotalcost());

        //test ComplexNumber
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
