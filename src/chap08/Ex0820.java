package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0820 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] board = new int[6][7];

        int turnCount = 1;
        while (!isGameWon(board)) {
            int playerTurn = (turnCount % 2 == 0) ? 2 : 1;

            System.out.println();
            System.out.print("Drop a ");
            System.out.print(playerTurn == 1? "Red" : "Yellow" );
            System.out.print(" disk at column (0 - 6): ");
            int playCol = input.nextInt();
            for (int r = 6 - 1; r >= 0; r--) {
                if (board[r][playCol] == 0) {
                    board[r][playCol] = playerTurn;
                    break;
                }
            }

            turnCount++;
            printBoard(board);
//            printBoard2(board);
        }
    }

    public static boolean isGameWon(int[][] values) {
        boolean condition = rowCheck(values) || colCheck(values) || diagonalD1Check(values) || diagonalD2Check(values);
        return condition;
    }

    public static boolean rowCheck(int[][] values) {
        for (int r = 0; r < values.length; r++) {
            for (int c = 0; c + 3 < values[0].length; c++) {
                if (values[r][c] == 0) continue;
                boolean match = true;
                for (int c1 = c + 1; c1 <= c + 3; c1++) {
                    if (values[r][c1] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.printf("Player %d won!", values[r][c]);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean colCheck(int[][] values) {
        for (int c = 0; c < values[0].length; c++) {
            for (int r = 0; r + 3 < values.length; r++) {
                if (values[r][c] == 0) continue;
                boolean match = true;
                for (int r1 = r + 1; r1 <= r + 3; r1++) {
                    if (values[r1][c] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.printf("Player %d won!", values[r][c]);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean diagonalD1Check(int[][] values) {
        for (int r = values.length - 1; r >= 3; r-- ) {
            for (int c = 0; c + 3 < values[0].length; c++) {
                if (values[r][c] == 0) continue;
                boolean match = true;
                for (int c1 = c + 1, r1 = r - 1; c1 <= c + 3; c1++, r1--) {
                    if (values[r1][c1] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.printf("Player %d won!", values[r][c]);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean diagonalD2Check(int[][] values) {
        for (int r = 0; r + 3 < values.length; r++) {
            for (int c = 0; c + 3 < values[0].length; c++) {
                if (values[r][c] == 0) continue;
                boolean match = true;
                for (int r1 = r + 1, c1 = c + 1; r1 <= r + 3; r1++, c1++) {
                    if (values[r1][c1] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.printf("Player %d won!", values[r][c]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void printBoard(int[][] board) {
        for (int r = 0; r < board.length; r++ ) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 0) System.out.print("_ ");
                else if (board[r][c] == 1) System.out.print("R ");
                else System.out.print("Y ");

                if (c == board[r].length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void printBoard2(int[][] board) {
        for (int[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

}
