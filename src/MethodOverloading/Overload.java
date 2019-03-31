package MethodOverloading;

public class Overload {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12))
            return -1;
        return (12 * feet + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0)
            return -1;
        double feet = 0;
        while (inches >= 12) {
            feet++;
            inches -= 12;
        }
       return  calcFeetAndInchesToCentimeters(feet, inches);
    }
}
