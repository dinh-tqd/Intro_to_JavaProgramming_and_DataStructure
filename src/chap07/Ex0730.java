package chap07;

import java.util.Scanner;

public class Ex0730 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of values: ");
//        int n = input.nextInt();
//        int[] list = new int[n];
//        System.out.println("Enter the values: ");
//        for (int i = 0; i < n; i++) {
//            list[i] = input.nextInt();
//        }

        int[] list = {3,4,5,5,5,5,4,5};
        System.out.println(isConsecutiveFour(list));
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                count++;
                if (count == 4) return true;
            } else {
                count = 1;
            }
        }
        return false;


//        Code không sạch lắm, rườm rà, 2 vòng for lồng vào nhau
//        boolean result = false;
//        for (int i = 0; i < values.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j <= i + 3 && j < values.length; j++) {
//                if (values[j] != values[i]) {
//                    break;
//                } else {
//                    count++;
//                    if (count == 4) {
//                        result = true;
//                    }
//                }
//            }
//        }
//        return result;
    }
}
