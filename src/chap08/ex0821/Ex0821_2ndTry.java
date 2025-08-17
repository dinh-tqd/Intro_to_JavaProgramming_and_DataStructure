package chap08.ex0821;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0821_2ndTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int cityNumber = input.nextInt();   // 5

        double[][] cities = new double[cityNumber][2];
        System.out.println("Enter the coordinates of the cities: ");
        for (double[] city : cities) {
            // 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
            city[0] = input.nextDouble();
            city[1] = input.nextDouble();
        }

        // Print coordinates of all cities
//        for (double[] city : cities) {
//            System.out.println(Arrays.toString(city));
//        }
//        System.out.println();

        double[][] distancesToOtherCities = new double[cityNumber][cityNumber];
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length; j++) {
                distancesToOtherCities[i][j] = distance(cities[i], cities[j]);
            }
        }

        for (double[] r : distancesToOtherCities) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();

        int x = 0;
        double shortestTotalDistance = distanceSum(distancesToOtherCities[x]);

        for (int i = 1; i < cities.length; i++) {
            if (distanceSum(distancesToOtherCities[i]) < shortestTotalDistance) {
                shortestTotalDistance = distanceSum(distancesToOtherCities[i]);
                x = i;
            }
        }

        System.out.println("The central city is at " + "(" + cities[x][0] + ", " + cities[x][1] + ").");
        System.out.println(shortestTotalDistance);
    }

    public static double distance(double[] city1, double[] city2) {
        double result =  Math.sqrt((city1[0] - city2[0]) * (city1[0] - city2[0])
                + (city1[1] - city2[1]) * (city1[1] - city2[1]));

        // Format distance
        result = Double.parseDouble(String.format("%.2f", result));
        return result;
    }

    public static double distanceSum(double[] distances) {
        double result = 0;
        for (double distance : distances)
            result += distance;
        return result;
    }
}
