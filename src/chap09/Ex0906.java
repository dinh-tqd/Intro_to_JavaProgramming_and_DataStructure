package chap09;

public class Ex0906 {
    public static void main(String[] args) {
        StopWatchTest watch1 = new StopWatchTest();

        double[] numbers = new double[100_000];
        for (int i = 0; i < 100_000; i++) {
            numbers[i] = Math.random() * 100_000;
        }
        watch1.start();
        selectionSort(numbers);
        watch1.stop();
        System.out.println(watch1.getElapsedTime());
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

class StopWatch {
    private double startTime = new java.util.Date().getTime();
    private double endTime = startTime;
    StopWatch() {
    }
    public double getStartTime() {
        return startTime;
    }
    public double getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = new java.util.Date().getTime();
    }

    public void stop() {
        endTime = new java.util.Date().getTime();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
