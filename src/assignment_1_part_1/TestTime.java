package assignment_1_part_1;

import java.util.Calendar;
import java.util.TimeZone;

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}

public class TestTime {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("Current Time in GMT:");
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
