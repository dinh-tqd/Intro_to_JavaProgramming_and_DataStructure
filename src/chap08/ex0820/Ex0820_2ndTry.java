package chap08.ex0820;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0820_2ndTry {
    static final char PLAYER1 = 'R';
    static final char PLAYER2 = 'Y';
    static final char CHAR_FOR_EMPTY = '_';
    static final char[][] grid = new char[6][7];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (char[] r : grid)
            Arrays.fill(r, CHAR_FOR_EMPTY);

        // Print the board
        printBoard();

        int turn = 0;
        char player;
        while (!isGameWon()) {
            // Player turn announce
            player = turn % 2 == 0 ? PLAYER1 : PLAYER2;
            System.out.println("Drop a " + (player == PLAYER1 ? "RED" : "YELLOW")  + " disk at column (0-6): ");
            int column = input.nextInt();

            // Test legit move, if not, redo
            while (!isLegitMove(column)) {
                System.out.println("Invalid move. Drop a " + (player == PLAYER1 ? "RED" : "YELLOW") + " disk at column (0-6): ");
                column = input.nextInt();
            }

            // Player move on the board
            playerTurn(player, column);
            turn++;
            printBoard();

            if (isGameWon()) {
                System.out.print("\n--- o0o ---\n");
                System.out.println(player + " WON !!!");
            }
        }


    }

    public static void playerTurn(char player, int column) {
        for (int r = grid.length - 1; r >= 0; r--) {
            if (grid[r][column] == CHAR_FOR_EMPTY) {
                grid[r][column] = player;
                break;
            }
        }
    }

    public static boolean isLegitMove(int column) {
        if (column < 0 || column >= grid[0].length)
            return false;
        if (grid[0][column] != CHAR_FOR_EMPTY)
            return false;
        return true;
    }

    public static boolean isGameWon() {
        return hasFourConsecutive(grid);
    }

    public static void printBoard() {
        for (char[] r : grid) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }

    public static boolean hasFourConsecutiveInRow(char[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length - 3; c++) {
                int count = 1;
                for (int x = 1; x <= 3; x++ ) {
                    if (m[r][c + x] == m[r][c] && m[r][c] != CHAR_FOR_EMPTY) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
//                    System.out.print("Four consecutive FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }

        return result;
    }

    public static boolean hasFourConsecutiveInColumn(char[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;
        for (int c = 0; c < m[0].length; c++) {
            for (int r = 0; r < m.length - 3; r++) {
                int count = 1;
                for (int x = 1; x <= 3; x++) {
                    if (m[r + x][c] == m[r][c] && m[r][c] != CHAR_FOR_EMPTY) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
//                    System.out.print("Four consecutive in column FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean hasFourConsecutiveInLeftDiagonal(char[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;
        for (int r = 0; r < m.length - 3; r++) {
            for (int c = 0; c < m[0].length - 3; c++) {
                int count = 1;
                for (int x = 1; x <= 3; x++) {
                    if (m[r + x][c + x] == m[r][c] && m[r][c] != CHAR_FOR_EMPTY) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
//                    System.out.print("Four consecutive in left diagonal FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean hasFourConsecutiveInRightDiagonal(char[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;
        for (int r = 0; r < m.length - 3; r++) {
            for (int c = m[0].length - 1; c >= 3; c--) {
                int count = 1;
                for (int x = 1; x <= 3; x++) {
                    if (m[r + x][c - x] == m[r][c] && m[r][c] != CHAR_FOR_EMPTY) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
//                    System.out.print("Four consecutive in right diagonal FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean hasFourConsecutive(char[][] grid) {
        return hasFourConsecutiveInRow(grid) || hasFourConsecutiveInColumn(grid) || hasFourConsecutiveInLeftDiagonal(grid) || hasFourConsecutiveInRightDiagonal(grid);
    }
}
