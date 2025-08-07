package chap13.ex1304_advanced_SecondTry;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex1304 {
    public static final String[] MONTH_NAME = {
            "January", "February", "March",
            "April" ,"May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };

    public static void main(String[] args) {
        final int TODAY = 23;
        // Input month and year
        int currentMonth = Integer.parseInt(args[0]) - 1;
        int currentYear = Integer.parseInt(args[1]);
        // Print title
        System.out.print(MONTH_NAME[currentMonth] + " ");
        System.out.println(currentYear);
        System.out.println("-".repeat(10));

        // Current month calendar
        Calendar currentMonthCal = new GregorianCalendar();
        currentMonthCal.set(Calendar.YEAR, currentYear);
        currentMonthCal.set(Calendar.MONTH, currentMonth);
        // Previous month calendar
        Calendar previousMonthCal = new GregorianCalendar();
        previousMonthCal.set(Calendar.YEAR, currentYear);
        previousMonthCal.set(Calendar.MONTH, currentMonth - 1);
        // Next month calendar
        Calendar nextMonthCal = new GregorianCalendar();
        nextMonthCal.set(Calendar.YEAR, currentYear);
        nextMonthCal.set(Calendar.MONTH, currentMonth + 1);

        // Print names of days of the week
        System.out.printf("%5s".repeat(7), "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println();

        // Determine which weekday of the first day of current month is
        currentMonthCal.set(Calendar.DATE, 1);
        int firstDayOfMonthWeekday = currentMonthCal.get(Calendar.DAY_OF_WEEK);

        // Print previous month's days
        int previousMonthLastDate = previousMonthCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int count = firstDayOfMonthWeekday - 1; count >= 1 ; count--) {
            System.out.printf("\033[2;37m%5d\033[0m", previousMonthLastDate - count + 1);
        }

        // Print current month's days

        for (int day = 1; day <= currentMonthCal.get(Calendar.DAY_OF_MONTH); day++) {
            if (day == TODAY) {
                System.out.printf("%3s\033[30;47m%2d\033[0m", "", day);
            } else {
                System.out.printf("%5d", day);
            }
            if (currentMonthCal.get(Calendar.DAY_OF_WEEK) % 7 == 0) {
                System.out.println();
            }
            if (day < currentMonthCal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
                currentMonthCal.add(Calendar.DAY_OF_MONTH, 1);
            }
        }

        // Print next month's days
        for (int day = 1; day <= 7 - currentMonthCal.get(Calendar.DAY_OF_WEEK); day++) {
            System.out.printf("\033[2;37m%5d\033[0m", day);
        }
    }
}
