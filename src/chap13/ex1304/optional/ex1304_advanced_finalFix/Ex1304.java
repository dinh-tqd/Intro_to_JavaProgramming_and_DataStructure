package chap13.ex1304.optional.ex1304_advanced_finalFix;
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
        final int TODAY_DAY_OF_MONTH = 13;
        final int TODAY_MONTH = Calendar.AUGUST;
        final int TODAY_YEAR = 2025;
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
        if (currentMonth == 0) {
            previousMonthCal.set(Calendar.YEAR, currentYear - 1);
            previousMonthCal.set(Calendar.MONTH, 11);
        } else {
            previousMonthCal.set(Calendar.YEAR, currentYear);
            previousMonthCal.set(Calendar.MONTH, currentMonth - 1);
        }

        // Print names of days of the week
        System.out.printf("%5s".repeat(7), "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println();

        // Determine which weekday of the first day of current month is
        currentMonthCal.set(Calendar.DATE, 1);
        int weekdayCounter = currentMonthCal.get(Calendar.DAY_OF_WEEK);

        // Print previous month's days
        int previousMonthLastDate = previousMonthCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int count = weekdayCounter - 1; count >= 1 ; count--) {
            System.out.printf("\033[2;37m%5d\033[0m", previousMonthLastDate - count + 1);
        }

        // Print current month's days
        int daysInMonth = currentMonthCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day <= daysInMonth; day++) {
            if (day == TODAY_DAY_OF_MONTH && currentMonth == TODAY_MONTH && currentYear == TODAY_YEAR) {
                System.out.printf("%2s\033[30;47m%3d\033[0m", "", day);
            } else {
                System.out.printf("%5d", day);
            }
            if (weekdayCounter % 7 == 0) {
                System.out.println();
            }
            weekdayCounter++;
        }

        // Print next month's days
        int day = 1;
        while (weekdayCounter % 7 != 1) {
            System.out.printf("\033[2;37m%5d\033[0m", day);
            weekdayCounter++;
            day++;
        }

        System.out.println();
    }
}

/*
 What did I fix ?
 1. Create a variable that is weekdayCounter
 instead of keep updating current month cal's DATE

 2. Unused next month cal
 Deleted

 3. Handle edge case:
 What if current month is January (0) ?
 Then previous month should not be -1
 -> Set previous month cal's year to current year - 1
 -> Set previous month cal's month to 11 (December)

 What if current month is December (11)
 Then next month should not be 12
 -> Set next month cal's year to current year + 1
 -> Set next month cal's month to 0 (January)

 4. What more should be added in the future ?
 > Check whether terminal support ANSI to decide the format of the output
 If it doesn't, then the above code won't display everything as u wish:
 That is: previous month's and next month's days are gray on black,
 current month is white on black
 and today is black on white
 > Input exception handling
 */
