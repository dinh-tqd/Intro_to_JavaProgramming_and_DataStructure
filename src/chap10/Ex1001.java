package chap10;

public class Ex1001 {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());

        System.out.println();
        time1.setTime(100000);
        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());

        System.out.println();
        Time time2 = new Time(5,23,55);
        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;
    private long elapseTime;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapseTime) {
        this.elapseTime = elapseTime;
        long elapseTimeInSecond = elapseTime / 1000;

        second = (int) (elapseTimeInSecond % 60);
        long elapseTimeInMinute = elapseTimeInSecond / 60;
        minute = (int) (elapseTimeInMinute % 60);
        long elapseTimeInHour = elapseTimeInMinute / 60;
        hour = (int) (elapseTimeInHour % 24);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        this.elapseTime = elapseTime;

        long elapseTimeInSecond = elapseTime / 1000;
        second = (int) (elapseTimeInSecond % 60);
        long elapseTimeInMinute = elapseTimeInSecond / 60;
        minute = (int) (elapseTimeInMinute % 60);
        long elapseTimeInHour = elapseTimeInMinute / 60;
        hour = (int) (elapseTimeInHour % 24);
    }
}
