package chap08;

import java.util.Arrays;

public class Ex0824 {
    public static void main(String[] args) {
        int[][] board = {
                {9,6,3,1,7,4,2,5,8},
                {1,7,8,3,2,5,6,4,9},
                {2,5,4,6,8,9,7,3,1},
                {8,2,1,4,3,7,5,9,6},
                {4,9,6,8,5,2,3,1,7},
                {7,3,5,9,6,1,8,2,4},
                {5,8,9,7,1,3,4,6,2},
                {3,1,7,2,4,6,9,8,5},
                {6,4,2,5,9,8,1,7,3},
        };

        System.out.println(checkRow(board));
        System.out.println(checkColumn(board));
        System.out.println(checkSmallBox(board));
        System.out.println("Final result: " + isValidSolution(board));
    }

    public static boolean isValidSolution(int[][] board) {
        boolean result = checkRow(board) && checkColumn(board) && checkSmallBox(board);
        return result;
    }

    public static boolean checkRow(int[][] board) {
        for (int r = 0; r < board.length; r++) {
            int[] elementsInRow = new int[9];
            for (int c = 0; c < board[r].length; c++) {
                elementsInRow[c] = board[r][c];
            }
            Arrays.sort(elementsInRow);
            for (int i = 0; i < 9; i++) {
                if (elementsInRow[i] != i + 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] board) {
        for (int c = 0; c < 9; c++) {
            int[] elementsInColumn = new int[9];
            for (int r = 0; r < 9; r++) {
                elementsInColumn[r] = board[r][c];
            }
            Arrays.sort(elementsInColumn);
            for (int i = 0; i < 9; i++) {
                if (elementsInColumn[i] != i + 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkSmallBox(int[][] board) {
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol+= 3) {
                int[] elementsInBox = new int[9];
                int count = 0;
                for (int r = startRow; r < startRow + 3; r++) {
                    for (int c = startCol; c < startCol + 3; c++) {
                        elementsInBox[count] = board[r][c];
                        count++;
                    }
                }
                Arrays.sort(elementsInBox);
                for (int elementsInBoxIndex = 0; elementsInBoxIndex < 9; elementsInBoxIndex++) {
                    if (elementsInBox[elementsInBoxIndex] != elementsInBoxIndex + 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
