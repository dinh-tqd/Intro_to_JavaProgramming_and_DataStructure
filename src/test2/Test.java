package test2;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Test {
    // 264414864639329557497913717698145082779489/2788815009188499086581352357412492142272

    public static void main(String[] args) {
        int month = Calendar.AUGUST; // Hằng số Calendar.AUGUST
        System.out.println(new DateFormatSymbols().getMonths()[month]);
    }
}

