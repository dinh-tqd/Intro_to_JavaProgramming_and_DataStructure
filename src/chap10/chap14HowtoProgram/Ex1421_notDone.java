package chap10.chap14HowtoProgram;

import java.lang.StringBuilder;

public class Ex1421_notDone {
    public static void main(String[] args) {
        double checkAmount = 112.43;

        moneyToString(checkAmount);
    }

    public static void moneyToString(double amount) {
        String checkAmountInString = String.valueOf(amount);
        StringBuilder sb = new StringBuilder(checkAmountInString);

        StringBuilder numberBeforeDecimalPoint = new StringBuilder();
        StringBuilder numberAfterDecimalPoint = new StringBuilder();

        int i;
        for (i = 0; i < sb.length() && sb.charAt(i) != '.'; i++) {
            numberBeforeDecimalPoint.append(sb.charAt(i));
        }
        for (i = i + 1; i < sb.length(); i++ ) {
            numberAfterDecimalPoint.append(sb.charAt(i));
        }

        System.out.println(numberBeforeDecimalPoint);
        numberAfterDecimalPoint.append("/100");
        System.out.println(numberAfterDecimalPoint);

    }
}
