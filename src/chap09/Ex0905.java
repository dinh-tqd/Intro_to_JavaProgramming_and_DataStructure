package chap09;
import java.util.GregorianCalendar;

public class Ex0905 {
    public static void main(String[] args) {

        GregorianCalendar date = new GregorianCalendar();
        System.out.println(date.get(GregorianCalendar.YEAR));
        System.out.println(date.get(GregorianCalendar.MONTH) + 1);
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println();
        GregorianCalendar date2 = new GregorianCalendar();
        date2.setTimeInMillis(1234567898765L);
        System.out.println(date2.get(GregorianCalendar.YEAR));
        System.out.println(date2.get(GregorianCalendar.MONTH) + 1);
        System.out.println(date2.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println();
        System.out.println(new java.util.GregorianCalendar().get(GregorianCalendar.YEAR));
    }
}
