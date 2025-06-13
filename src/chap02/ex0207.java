package chap02;

import java.util.Scanner;

public class ex0207 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        long totalMinute = input.nextLong();

        int totalYears = (int)(totalMinute / (60 * 24 * 365));
        int totalDays = (int)(totalMinute / (60 * 24)) % 365;
        System.out.println(totalYears);
        System.out.println(totalDays);
    }
}
