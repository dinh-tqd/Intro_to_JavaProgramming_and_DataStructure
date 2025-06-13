package chap02;

import java.util.Scanner;

public class ex0208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the timezone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();


        long totalSeconds = totalMilliseconds / 1000;
        int currentSecond = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        int currentHour = (int)(totalHours % 24);
        int currentHourFixed = currentHour + offset + (currentHour + offset < 0 ? 24 : 0);

        // currentHour - currentMinute - currentSecond > GMT
        System.out.print(currentHourFixed); // > GMT + 7
        System.out.print(":");
        System.out.print(currentMinute < 10 ? "0" + currentMinute : currentMinute);
        System.out.print(":");
        System.out.print(currentSecond < 10 ? "0" + currentSecond : currentSecond);
        System.out.print(" GMT" + ((offset > 0) ? "+" : "") + offset);
    }
}

