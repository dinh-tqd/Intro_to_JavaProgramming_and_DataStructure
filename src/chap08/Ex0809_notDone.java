package chap08;
import java.util.Scanner;

public class Ex0809_notDone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] board = new int[3][3];
        boolean player1Won = false;
        boolean player2Won = false;
        int turn = 1;
        int a, b;
        while (!isGameOver(board)) {
            if (turn % 2 == 1) {
                System.out.println("Player 1 turns !");
                a = input.nextInt();
                b = input.nextInt();
                if (isValidMove(board,a,b)) {
                    board[a][b] = 1;
                }
            } else {
                System.out.println("Player 2 turns !");
                a = input.nextInt();
                b = input.nextInt();
                if (isValidMove(board,a,b)) {
                    board[a][b] = 2;
                }
            }
            turn++;
            printBoard(board);
        }
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    System.out.print("_");
                } else if (board[i][j] == 1) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(int[][] board, int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }
        if (board[row][col] != 0) {
            return false;
        }
        return true;
    }

    public static boolean isGameOver(int[][] board) {
        // Check row
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][0] == board[row][2]) {
                if (board[row][0] != 0 )
                    return true;
            }
        }

        // Check col
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[0][col] == board[2][col]) {
                if (board[0][col] != 0 )
                    return true;
            }
        }

        // Check major diagonal
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if (board[0][0] != 0)
                return true;
        }

        // Check minor diagonal
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            if (board[0][2] != 0)
                return true;
        }

        return false;
    }
}

// Chưa xử lí khi người chơi nhập ô đã có người đánh
// Chưa thông báo nếu như hoà
// Chưa thông báo người thắng