package assignment_1_part_1;

import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current Month: " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Current Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
