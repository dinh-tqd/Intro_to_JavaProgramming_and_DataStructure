package chap13;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex1304 {
    public static final int TODAY_DATE = 18;
    public static void main(String[] args) {


        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, 5);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        String[] monthString = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(monthString[9] + " " + 2019);
        for (int i = 0; i < 35; i++)
            System.out.print("-");
        System.out.println();

        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

        int elementCount = 1;
        int dayCount = 1;
        DAY[][] days = new DAY[6][7];

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}

class DAY {
    public static final int MIN = 1;
    public static final int MAX = 31;

    private int day = 1;
    private boolean isPreviousMonth = false;
    private boolean isNextMonth = false;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= MIN && day <= MAX)
            this.day = day;
    }

    public void setIsPreviousMonth(boolean isPreviousMonth) {
        this.isPreviousMonth = isPreviousMonth;
    }

    public boolean getIsPreviousMonth() {
        return isPreviousMonth;
    }

    public void setIsNextMonth(boolean isNextMonth) {
        this.isNextMonth = isNextMonth;
    }

    public boolean getIsNextMonth() {
        return isNextMonth;
    }
}
