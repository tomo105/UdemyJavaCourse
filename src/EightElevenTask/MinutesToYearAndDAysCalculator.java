package EightElevenTask;

public class MinutesToYearAndDAysCalculator {
    private static final String INVALID_VALUE = "Invalid value";

    public void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        long year,days,mins;
        days = minutes /( 60 *24);
        System.out.println(days);
        year = days/365;
        days %= 365;
        System.out.println( minutes +" min= " + year +"  y " +days + " d");
    }
}
