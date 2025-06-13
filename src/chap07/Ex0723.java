package chap07;

public class Ex0723 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        for (int student = 0; student < 100; student++) {
            for (int i = 0; i < lockers.length; i++) {
                if ((i + 1) % (student + 1) == 0 ) {
                    lockers[i] = !lockers[i];
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
