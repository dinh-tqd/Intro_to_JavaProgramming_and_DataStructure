package chap08.ex0836;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0836 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = input.nextInt();

        char[][] m = new char[n][n];
        System.out.printf("Enter %d rows of letters separated by space: %n", n);

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                m[r][c] = input.next().charAt(0);
                if (m[r][c] < 'A' || m[r][c] > 'A' + n - 1) {
                    System.out.printf("Wrong input: the letters must be from %c to %c", 'A', (char)('A' + n - 1));
                    return;
                }
            }
        }

        System.out.println(isLatinSquare(m));

    }

    public static boolean isLatinSquare(char[][] m) {
        int n = m.length;
        for (int r = 0; r < n; r++) {
            char[] charsInRow = new char[n];
            for (int c = 0; c < n; c++) {
                charsInRow[c] = m[r][c];
            }
            Arrays.sort(charsInRow);
            for (int i = 0; i < n; i++) {
                if (charsInRow[i] != 'A' + i) return false;
            }
        }

        for (int c = 0; c < n; c++) {
            char[] charsInColumn = new char[n];
            for (int r = 0; r < n; r++) {
                charsInColumn[r] = m[r][c];
            }
            Arrays.sort(charsInColumn);
            for (int i = 0; i < n; i++) {
                if (charsInColumn[i] != 'A' + i) return false;
            }
        }

        return true;
    }
}

// Cách này dễ hiểu cho người mới học, nhưng hiệu năng không tốt:
// Arrays.sort() có độ phức tạp trung bình là O(n log n),
// trong khi cách dùng boolean[n] để đánh dấu chỉ mất O(n)
// Nếu tối ưu hiệu suất: nên dùng cách ánh xạ và boolean[]