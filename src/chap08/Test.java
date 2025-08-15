package chap08;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random() * 10);
        }

        int[] b = a.clone();
        a[0] = 2;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
