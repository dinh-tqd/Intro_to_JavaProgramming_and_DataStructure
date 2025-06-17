package chap13;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex1304 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 9);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        String[] monthString = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(monthString[9] + " " + 2019);
        for (int i = 0; i < 35; i++)
            System.out.print("-");
        System.out.println();

        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

        int elementCount = 1;
        int dayCount = 1;
        int[][] days = new int[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (elementCount >= calendar.get(Calendar.DAY_OF_WEEK) && dayCount <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) {
                    days[i][j] = dayCount;
                    dayCount++;
                }
                elementCount++;
            }
        }

        for (int row = 0; row < days.length; row++) {
            for (int column = 0; column < days[0].length; column++) {

                if (days[row][column] == 0) {
                    System.out.printf("%5s", "");
                } else {
                    System.out.printf("%5d", days[row][column]);
                }
                if (column == days[0].length - 1)
                    System.out.println();
            }
        }

        System.out.println(calendar.get(Calendar.DATE));
    }
}
