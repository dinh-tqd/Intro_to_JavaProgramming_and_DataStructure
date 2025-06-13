package chap07;

public class Ex0711 {
    public static void main(String[] args) {
        double[] array = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        System.out.println(mean(array));
        System.out.println(deviation(array));
    }

    public static double deviation(double[] x) {
        double result = 0;
        double s = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            s += (x[i] - mean(x)) * (x[i] - mean(x));
            count++;
        }

        result = Math.sqrt(s / (count - 1));
        return result;
    }

    public static double mean(double[] x) {
        double result = 0;
        double sum = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
            count++;
        }
        return sum/count;
    }
}
