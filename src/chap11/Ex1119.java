package chap11;

import java.util.Arrays;
import java.util.ArrayList;

public class Ex1119 {
    public static final int MAX_WEIGHT = 10;

    public static void main(String[] args) {
        int numberOfObjects = 6;

        ArrayList<Integer> weights = new ArrayList<>(Arrays.asList(7,5,2,3,5,8));

        ArrayList<ArrayList<Integer>> bins = new ArrayList<>();

        while (!weights.isEmpty()) {
            ArrayList<Integer> bin = new ArrayList<>();
            for (int i = 0; i < weights.size(); i++) {
                if (getWeight(bin) + weights.get(i) <= MAX_WEIGHT) {
                    bin.add(weights.get(i));
                    weights.remove(i);
                    i--;
                }
            }
            bins.add(bin);
        }

        for (ArrayList<Integer> container : bins) {
            System.out.println(container);
        }
    }

    public static int getWeight(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}
