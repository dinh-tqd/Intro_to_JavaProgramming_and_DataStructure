package chap13.ex1304;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Ex1304 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();

        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);

        if (args.length == 0) {
            // No change
        } else if (args.length == 1) {
            month = Integer.parseInt(args[0]);
        } else if (args.length == 2) {
            month = Integer.parseInt(args[0]);
            year = Integer.parseInt(args[1]);
        } else {
            System.out.println("Invalid argument.");
            System.out.println("Format should be: ");
            System.out.println("java Ex1304 month year");
            System.out.println("or");
            System.out.println("java Ex1304 month");
            System.out.println("or");
            System.out.println("java Ex1304");
            System.exit(1);
        }

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        String[] MONTH_NAME = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        System.out.print(MONTH_NAME[cal.get(Calendar.MONTH)] + " ");
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("--------------");

        System.out.printf("%5s%5s%5s%5s%5s%5s%5s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println();

        for (int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) {
            // Replace "_" with "" if you want
            System.out.printf("%5s", "_");
        }

        int count = 1;
        int dayOfWeekCount = cal.get(Calendar.DAY_OF_WEEK);

        while (count <= cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
            System.out.printf("%5s", count);
            if (dayOfWeekCount % 7 == 0)
                System.out.println();
            count++;
            dayOfWeekCount = dayOfWeekCount % 7 + 1;
        }

        System.out.println();
    }
}
