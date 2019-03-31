package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Overload o = new Overload();
        System.out.println(o.calcFeetAndInchesToCentimeters(8, 4));
        System.out.println(o.calcFeetAndInchesToCentimeters(71));
    }

}
