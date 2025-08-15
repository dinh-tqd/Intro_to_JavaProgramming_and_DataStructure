package chap08.ex0809;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0809 {
    static final Scanner input = new Scanner(System.in);
    static char[][] grid = new char[3][3];
    static final char charForEmptySquare = '_';
    static final char charForPlayer1 = 'X';
    static final char charForPlayer2 = 'O';
//    public enum Status {WIN, LOSE, DRAW, CONTINUE};
//    public static Status gameStatus;

    public static void main(String[] args) {
        for (char[] r : grid)
            Arrays.fill(r, charForEmptySquare);
        printBoard(grid);
        System.out.print("\n---\n");

        int turn = 1;
        while (!isGameWon(grid)) {
            playerTurn(turn % 2);
            printBoard(grid);

            System.out.print("\n---\n");
            turn++;
        }
    }

    public static void playerTurn(int player) {
        char c;
        if (player == 1) {
            c = charForPlayer1;
        } else {
            c = charForPlayer2;
        }

        int row, column;
        System.out.println("Enter a row (0, 1, 2) for player " + c + ": ");
        row = input.nextInt();
        System.out.println("Enter a column (0, 1, 2) for player " + c + ": ");
        column = input.nextInt();

        while (!isLegitMove(row, column)) {
            System.out.println("Invalid move !");
            System.out.println("Enter a row (0, 1, 2) for player " + c + ": ");
            row = input.nextInt();
            System.out.println("Enter a column (0, 1, 2) for player " + c + ": ");
            column = input.nextInt();
        }

        grid[row][column] = c;
    }

    public static boolean isLegitMove(int r, int c) {
        boolean validR = (r >= 0 && r < grid.length);
        boolean validC = (c >= 0 && c < grid[0].length);
        if (!validR || !validC)
            return false;

        if (grid[r][c] != charForEmptySquare)
            return false;

        return true;
    }

    public static void printBoard(char[][] grid) {
        System.out.println("-".repeat(13));

        for (int r = 0; r < grid.length; r++) {
            System.out.print("| ");
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c] + " | ");
                if (c == grid[0].length - 1)
                    System.out.println();
            }
            System.out.println("-".repeat(13));
        }
    }

    public static boolean isGameWon(char[][] grid) {
        // Check Row
        for (int r = 0; r < grid.length; r++) {
            int aCount = 0;
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][0] != charForEmptySquare && grid[r][c] == grid[r][0]) {
                    aCount++;
                }
            }

            if (aCount == grid.length) {
                System.out.print("Player " + grid[r][0] + " won!");
                return true;
            }
        }

        // Check Column
        for (int c = 0; c < grid[0].length; c++) {
            int bCount = 0;
            for (int r = 0; r < grid.length; r++) {
                if (grid[0][c] != charForEmptySquare && grid[r][c] == grid[0][c]) {
                    bCount++;
                }
            }

            if (bCount == grid.length) {
                System.out.print("Player " + grid[0][c] + " won!");
                return true;
            }
        }

        // Check major diagonal
        int cCount = 0;
        for (int r = 0; r < grid.length; r++) {
            if (grid[0][0] != charForEmptySquare && grid[r][r] == grid[0][0]) {
                cCount++;
            }
            if (cCount == grid.length) {
                System.out.print("Player " + grid[0][0] + " won!");
                return true;
            }
        }


        // Check minor diagonal
        int dCount = 0;
        for (int r = 0; r < grid.length; r++) {
            int c = grid[0].length - 1 - r;
            if (grid[0][grid[0].length - 1] != charForEmptySquare && grid[r][c] == grid[0][grid[0].length - 1]) {
                dCount++;
            }
            if (dCount == grid.length) {
                System.out.print("Player " + grid[0][grid[0].length - 1] + " won!");
                return true;
            }
        }


        return false;
    }
}
