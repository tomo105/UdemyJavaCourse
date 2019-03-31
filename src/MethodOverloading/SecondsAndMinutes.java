package MethodOverloading;

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MEESSAGE = "Invalid Value";
    public  String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59)
            return INVALID_VALUE_MEESSAGE;
        int hour, min;
        hour = minutes / 60;
        min = minutes % 60;
        return hour + "h " + min + "m " + seconds + "s";
    }

    public  String getDurationString(int seconds) {
        if (seconds < 0)
            return INVALID_VALUE_MEESSAGE;
        int min = seconds / 60;
        seconds %= 60;
        return getDurationString(min, seconds);
    }
}
