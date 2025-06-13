package chap07;

public class Ex0708 {
    public static void main(String[] args) {
        int[] listOfInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] listOfDouble = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.11, 10.12};
        System.out.println(average(listOfInt));
        System.out.println(average(listOfDouble));
    }

    public static double average(int[] array) {
        int sum = 0;
        int count = 0;
        for (int e : array) {
            sum += e;
            count++;
        }
        return (double) sum / count;
    }

    public static double average(double[] array) {
        double sum = 0;
        int count = 0;
        for (double e : array) {
            sum += e;
            count++;
        }
        return sum / count;
    }
}
