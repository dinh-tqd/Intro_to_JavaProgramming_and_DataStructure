package chap13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex1304 {
    public static final int TODAY_DATE = 2;

    public static void main(String[] args) {


        Calendar currentMonthCalendar = new GregorianCalendar();
        currentMonthCalendar.set(Calendar.YEAR, 2025);
        currentMonthCalendar.set(Calendar.MONTH, 9);
        currentMonthCalendar.set(Calendar.DAY_OF_MONTH, 1);

        Calendar previousMonthCalendar = new GregorianCalendar();
        previousMonthCalendar.set(Calendar.YEAR, 2025);
        previousMonthCalendar.set(Calendar.MONTH, 8);
        previousMonthCalendar.set(Calendar.DAY_OF_MONTH, 1);


        String[] monthString = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.printf("        %s %d%n", monthString[currentMonthCalendar.get(Calendar.MONTH)], currentMonthCalendar.get(Calendar.YEAR));

        for (int i = 0; i < 35; i++)
            System.out.print("-");
        System.out.println();

        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

        int elementCount = 1;
        int day = 1;
        int start = currentMonthCalendar.get(Calendar.DAY_OF_WEEK);

        int nextMonthDayStart = 1;
        int previousMonthDayStart = previousMonthCalendar.getActualMaximum(Calendar.DAY_OF_MONTH) - (start - 2);
        System.out.println();


        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 7; c++) {
                if (elementCount < start) {
                    System.out.printf("%2s\033[2;37m%3d\033[0m", "", previousMonthDayStart);
                    previousMonthDayStart++;
                } else if (day <= currentMonthCalendar.getActualMaximum(Calendar.DAY_OF_MONTH)) {
                    if (day == TODAY_DATE) {
                        System.out.printf("%2s\033[30;47m%3d\033[0m", "", day); // đen trên nền trắng
                    } else {
                        System.out.printf("%5d", day);
                    }
                    day++;
                } else {
                    System.out.printf("%2s\033[2;37m%3d\033[0m", "", nextMonthDayStart);
                    nextMonthDayStart++;
                }
                if (c == 6) System.out.println();
                elementCount++;
            }
        }
    }
}

