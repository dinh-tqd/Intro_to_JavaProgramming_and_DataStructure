package chap07;

public class Ex0726 {
    public static void main(String[] args) {
        int[] list1 = {5,2,5,6,6,1};
        int[] list2 = {5,2,5,6,1,6};
        System.out.println(equals(list1, list2));
    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean result = true;
        int i = 0;
        if (list1.length != list2.length) {
            result = false;
        } else while (i < list1.length && result) {
            if (list1[i] != list2[i]) {
                result = false;
            }
            i++;
        }
        return result;
    }
}
