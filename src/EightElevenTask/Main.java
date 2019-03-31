package EightElevenTask;

public class Main {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        a.area(5);
        a.area(3,5);
        MinutesToYearAndDAysCalculator m = new MinutesToYearAndDAysCalculator();
        m.printYearsAndDays(561608);
    }
}
