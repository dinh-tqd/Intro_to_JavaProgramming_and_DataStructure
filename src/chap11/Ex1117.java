package chap11;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1117 {
    public static void main(String[] args) {
        int m = 90;
        System.out.println(primeFactors(m));
        System.out.println(factorsWithOddCount(m));

        int n = 1;
        for (int factor : factorsWithOddCount(m)) {
            n *= factor;
        }
        System.out.println("n = " + n);
    }

    public static ArrayList<Integer> primeFactors(int m)  {
        ArrayList<Integer> list = new ArrayList<>();
        int alt = m;
        for (int i = 2; i <= alt; i++) {
            while (alt % i == 0) {
                list.add(i);
                alt /= i;
            }
        }
        return list;
    }

    public static ArrayList<Integer> factorsWithOddCount(int m) {
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> myList = primeFactors(m);

        int i = 0;
        while (i < myList.size()) {
            int current = myList.get(i);
            int count = 0;

            while (i < myList.size() && myList.get(i).equals(current) ) {
                count++;
                i++;
            }

            if (count % 2 == 1) {
                resultList.add(current);
            }
        }

        return resultList;
    }
}
