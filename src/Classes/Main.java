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
        Point p = new Point(3, 4);
        Point p2 = new Point(8,10);
        System.out.println("distance to point(0,0) = " + p.distance());
        System.out.println("distace from my point to another point is  " +p.distance(p2));
    }
}
