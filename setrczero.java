import java.util.*;

public class setrczero {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the elements into the 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Initial matrix:");
        printMatrix(matrix);

        setZero(matrix);

        System.out.println("The new matrix:");
        printMatrix(matrix);
    }
    public static void setZero(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Identify which rows and columns should be set to zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Set rows to zero
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }

        // Set columns to zero
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
