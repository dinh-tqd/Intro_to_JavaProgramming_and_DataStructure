package chap07;

public class Ex0713 {
    public static void main(String[] args) {
        final int TIMES_RANDOM = 45;
        final int NUMBERS_PER_LINE = 15;
        for (int count = 1; count <= 45; count++) {
            System.out.print(getRandom(1, 100, 4, 8, 95, 93) + " ");
            if (count % NUMBERS_PER_LINE == 0) System.out.println();
        }
    }

    public static int getRandom(int start, int end, int... numbers) {
        int random;
        boolean reRandomCondition;
        do {
            reRandomCondition = false;
            random = (int) (Math.random() * (end - start + 1)) + start;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == random) {
                    reRandomCondition = true;
                    break;
                }
            }
        } while (reRandomCondition);
        return random;
    }
}
