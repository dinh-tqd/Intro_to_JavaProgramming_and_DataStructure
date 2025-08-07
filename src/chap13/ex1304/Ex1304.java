package chap13.ex1304;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Ex1304 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, Integer.parseInt(args[1]));
        cal.set(Calendar.MONTH, Integer.parseInt(args[0]) - 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        System.out.print(new DateFormatSymbols().getMonths()[cal.get(Calendar.MONTH)] + " ");
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("--------------");

        System.out.printf("%5s%5s%5s%5s%5s%5s%5s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println();

        for (int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) {
            // Replace "_" with ""
            System.out.printf("%5s", "");
        }

        int count = 1;
        while (count <= cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
            System.out.printf("%5s", count);
            cal.set(Calendar.DAY_OF_MONTH, count);
            if (cal.get(Calendar.DAY_OF_WEEK) % 7 == 0)
                System.out.println();
            count++;
        }

    }
}
