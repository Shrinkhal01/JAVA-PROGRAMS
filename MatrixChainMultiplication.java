import java.util.Scanner;
public class MatrixChainMultiplication {
    public static int matrixChainOrder(int[] p, int n) {
        int[][] m = new int[n][n];
        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                    }
                }
            }
        }
        return m[1][n - 1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of matrices: ");
        int n = scanner.nextInt();
        int[] dimensions = new int[n + 1];
        System.out.println("Enter the dimensions of matrices:");
        for (int i = 0; i <= n; i++) {
            System.out.print("Dimension " + (i + 1) + ": ");
            dimensions[i] = scanner.nextInt();
        }
        int minMultiplications = matrixChainOrder(dimensions, n + 1);
        System.out.println("Minimum number of multiplications is: " + minMultiplications);

        scanner.close();
    }
}
