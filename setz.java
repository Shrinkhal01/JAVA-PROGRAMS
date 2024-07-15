import java.util.*;

public class setz {
    static ArrayList<ArrayList<Integer>> calculateSetz(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int r[] = new int[n]; // row array
        int c[] = new int[m]; // column array
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        
        return matrix;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Corrected typo in Scanner instantiation
        System.out.println("Enter the matrix length and breadth:");
        int n = s.nextInt();
        int m = s.nextInt();
        
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            System.out.println("Enter the elements of row " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                row.add(s.nextInt());
            }
            matrix.add(row);
        }
        
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
        matrix = calculateSetz(matrix, n, m);
        
        System.out.println("Modified Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
        s.close(); // Close the scanner
    }
}
