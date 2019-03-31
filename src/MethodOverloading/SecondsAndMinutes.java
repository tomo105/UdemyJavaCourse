package MethodOverloading;

public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59)
            return "Invalid value";
        int hour, min;
        hour = minutes / 60;
        min = minutes % 60;
        return hour+"h "+min+"m "+seconds+"s";
    }
    public static String getDurationstring(int seconds) {
        if( seconds < 0)
            return "invalid value";
        int min = seconds/60;
        seconds %=60;
        return getDurationString(min,seconds);
    }
}
