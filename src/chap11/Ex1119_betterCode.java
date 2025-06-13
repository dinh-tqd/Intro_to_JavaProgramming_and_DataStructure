package chap11;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class Ex1119_betterCode {
    public static final int MAX_WEIGHT = 10;

    public static void main(String[] args) {
        ArrayList<Integer> weights = new ArrayList<>(Arrays.asList(7,5,2,3,5,8));

        // Sort giảm dần weights
        Collections.sort(weights);
        Collections.reverse(weights);
        System.out.println(weights);

        ArrayList<ArrayList<Integer>> bins = new ArrayList<>();
        for (int weight : weights) {
            boolean placed = false;

            for (ArrayList<Integer> bin : bins) {
                if (getWeight(bin) + weight <= MAX_WEIGHT) {
                    bin.add(weight);
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                ArrayList<Integer> newBin = new ArrayList<>();
                newBin.add(weight);
                bins.add(newBin);
            }
        }

        for (ArrayList<Integer> bin : bins) {
            System.out.println(bin);
        }
    }



    public static int getWeight(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list)
            sum += number;
        return sum;
    }
}
