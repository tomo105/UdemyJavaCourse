package Classes;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(4);
        calc.setSecondNumber(6);
        calc.getAdditionResult();
        calc.getDivisionresult();
        Wall w = new Wall();
        w.setWidth(1.125);
        System.out.println(w.getWidth());
    }
}
