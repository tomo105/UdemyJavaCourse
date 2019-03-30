package firstSevenTasks;

public class Main {
    public static void main(String[] args) {
        SpeedConverter s = new SpeedConverter();
        System.out.println( s.toMilesPerHour(97.25));
        s.printConversion(10.25);
    }
}
