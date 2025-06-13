package chap11;

import java.util.Arrays;
import java.util.ArrayList;

public class Ex1119_3rdTry {
    public static final int MAX_WEIGHT = 10;

    public static void main(String[] args) {
        ArrayList<Integer> weights = new ArrayList<>(Arrays.asList(7,5,2,3,5,8));
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();

        while (!weights.isEmpty() ) {
            ArrayList<Integer> container = new ArrayList<>();
            for (int i = 0; i < weights.size(); i++) {
                if (totalWeightInContainer(container) + weights.get(i) <= MAX_WEIGHT) {
                    container.add(weights.get(i));
                    weights.remove(Integer.valueOf(weights.get(i)));
                    i--;
                }
            }
            containers.add(container);
        }

        for (ArrayList<Integer> container : containers) {
            System.out.println(container);
        }


    }

    public static int totalWeightInContainer(ArrayList<Integer> container) {
        int result = 0;
        for (Integer bin : container) {
            result += bin;
        }
        return result;
    }
}
