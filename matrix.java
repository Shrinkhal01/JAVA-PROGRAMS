import java.util.Scanner;
import java.util.Arrays;


class Matrix {
    static int[][] Add(int A[][], int B[][]) {
        int C[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    static int[][] Mul(int A[][], int B[][]) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    static int[][] Tra(int A[][]) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[j][i];
            }
        }

        return C;
    }

    static int Det(int A[][]) {
        int det = 0;
        det += A[0][0] * (A[1][1] * A[2][2] - A[2][1] * A[1][2]);
        det -= A[0][1] * (A[1][0] * A[2][2] - A[2][0] * A[1][2]);
        det += A[0][2] * (A[1][0] * A[2][1] - A[2][0] * A[1][1]);
        return det;      
    }

    public static void main(String[] args) {
        int mtrx[][] = new int[3][3];
        int mtrx2[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of the array1 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mtrx[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements of the array2 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mtrx2[i][j] = s.nextInt();
            }
        }
        int[][] sum = Add(mtrx, mtrx2);
        int[][] product = Mul(mtrx, mtrx2);
        int[][] transpose = Tra(mtrx);
        int det = Det(mtrx);
        System.out.println("For matrices, sum is = " + Arrays.deepToString(sum) +
                "\nProduct = " + Arrays.deepToString(product) +
                "\nTranspose = " + Arrays.deepToString(transpose) +
                "\nDeterminant =" + det);
        System.out.println();
    }
}
