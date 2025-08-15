
package chap08.ex0804;
import java.util.Arrays;

public class Ex0804 {
    public static void main(String[] args) {
        int[][] employeesAndHoursInWeek = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9},
        };

        int[][] employeesAndHoursTotal = new int[employeesAndHoursInWeek.length][2];
        for (int i = 0; i < employeesAndHoursTotal.length; i++) {
            employeesAndHoursTotal[i][0] = i;
            for (int j = 0; j < employeesAndHoursInWeek[i].length; j++) {
                employeesAndHoursTotal[i][1] += employeesAndHoursInWeek[i][j];
            }
        }

        // Sort
        for (int i = 0; i < employeesAndHoursTotal.length; i++) {
            for (int j = i + 1; j < employeesAndHoursTotal.length; j++) {
                if (employeesAndHoursTotal[i][1] < employeesAndHoursTotal[j][1]) {
                    int[] temp = employeesAndHoursTotal[i];
                    employeesAndHoursTotal[i] = employeesAndHoursTotal[j];
                    employeesAndHoursTotal[j] = temp;
                }
            }
        }

        // Print out
        for (int i = 0; i < employeesAndHoursTotal.length; i++) {
            System.out.println(Arrays.toString(employeesAndHoursTotal[i]));
        }
    }

}


