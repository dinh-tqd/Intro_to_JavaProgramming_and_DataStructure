package chap09;
import java.util.Date;

public class Ex0903 {
    public static void main(String[] args) {

        Date date = new Date();

        long[] elapsedTimes = {10_000, 100_000, 1_000_000, 10_000_000, 1_000_000_000, 10_000_000_000L, 1_000_000_000_000L, 1_000_000_000_000L};
        for (long elapsedTime : elapsedTimes) {
            date.setTime(elapsedTime);
            System.out.println(date.toString());
        }
    }
}


