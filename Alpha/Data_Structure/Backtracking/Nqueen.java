import java.util.Arrays;

public class Nqueen {
    static int count = 0;

    public static void main(String[] args) {
        int n = 1;
        char board[][] = new char[n][n];

        for (char[] ch : board) {
            Arrays.fill(ch, '.');
        }

        nQueen(board, 0);
        System.out.println(count);
    }

    public static void nQueen(char board[][], int row) {
        // Base Case
        if (row == board.length) {
            count++;
            printBoard(board);
            return;
        }

        // recursion and backtracking
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {

        // Vertically Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Digonally Left Up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Digonally Right Up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("--------Chess Board----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
