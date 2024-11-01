import java.util.Scanner;
public class NQueens {
    private static boolean isSafe(int[][] board, int row, int col, int N) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }
        return true;
    }
    private static boolean solveNQueens(int[][] board, int col, int N) {
        if (col >= N) {
            printSolution(board, N);
            return true;
        }
        boolean res = false;
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col, N)) {
                board[i][col] = 1;
                res = solveNQueens(board, col + 1, N) || res;
                board[i][col] = 0;
            }
        }
        return res;
    }
    private static void printSolution(int[][] board, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((board[i][j] == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the board (N): ");
        int N = sc.nextInt();

        int[][] board = new int[N][N];
        if (!solveNQueens(board, 0, N)) {
            System.out.println("No solution exists for " + N + " queens.");
        }
        sc.close();
    }
}
