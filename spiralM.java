import java.util.Scanner;

class spiralM {
    public static int[][] enterMatrix() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = s.nextInt();
            }
        }
        return matrix;
    }

    public static void Sptr(int[][] m, int r, int c) {
        int total = r * c;
        int temp = 0;
        int r1 = 0, r2 = r - 1;
        int c1 = 0, c2 = c - 1;
        while (temp < total) {
            for (int i = c1; i <= c2 && temp < total; i++) {
                System.out.print(m[r1][i] + " ");
                temp++;
            }
            r1++;
            for (int i = r1; i <= r2 && temp < total; i++) {
                System.out.print(m[i][c2] + " ");
                temp++;
            }
            c2--;
            for (int i = c2; i >= c1 && temp < total; i--) {
                System.out.print(m[r2][i] + " ");
                temp++;
            }
            r2--;
            for (int i = r2; i >= r1 && temp < total; i--) {
                System.out.print(m[i][c1] + " ");
                temp++;
            }
            c1++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = enterMatrix();
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("Spiral Order of the matrix:");
        Sptr(matrix, rows, cols);
    }
}
