package firstSevenTasks;

public class Main {
    public static void main(String[] args) {
        SpeedConverter s = new SpeedConverter();
        System.out.println( s.toMilesPerHour(97.25));
        s.printConversion(10.25);
        MegaBytesConverter m = new MegaBytesConverter();
        m.printMegaBytesAndKiloBytes(4100);
        LeapYearCalculator leap = new LeapYearCalculator();
        System.out.println(leap.isLeapYear(1924));
        DecimalComparator d = new DecimalComparator();
        System.out.println(d.areEqualByThreeDecimalPlaces(23.4565,23.454));
        TeenNumberChecker teen = new TeenNumberChecker();
        if(teen.hasTeen(14,22,24))
            System.out.println("you can't go to casino");
        else
            System.out.println("go on ");
    }
}
