package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        double[][] cities = new double[numberOfCities][2];

        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < numberOfCities; i++) {
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        double[][] distances = new double[numberOfCities][numberOfCities];
        for (int a = 0; a < numberOfCities; a++) {
            for (int b = 0; b < numberOfCities; b++) {
                double x = (cities[a][0] - cities[b][0]) * (cities[a][0] - cities[b][0]) + (cities[a][1] - cities[b][1]) * (cities[a][1] - cities[b][1]);
                distances[a][b] = Math.sqrt(x);
            }
        }

        double[] sumOfDistances = new double[numberOfCities];
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < numberOfCities; j++) {
                sumOfDistances[i] += distances[i][j];
            }
        }

        System.out.println(Arrays.toString(locateCentralCity(cities, sumOfDistances)));
    }

    public static double[] locateCentralCity(double[][] cities, double[] sumOfDistances) {
        double[] result = new double[3];

        // Temporarily set cities[0] as central city and its sum of distances to all other city as the smallest
        result[0] = cities[0][0];
        result[1] = cities[0][1];
        result[2] = sumOfDistances[0];

        // Now compare with all other cities and change if needed
        double minSumOfDistance = sumOfDistances[0];
        for (int i = 0; i < cities.length; i++) {
            if (sumOfDistances[i] < minSumOfDistance) {
                minSumOfDistance = sumOfDistances[i];
                result[0] = cities[i][0];
                result[1] = cities[i][1];
                result[2] = minSumOfDistance;
            }
        }

        return result;
    }
}
