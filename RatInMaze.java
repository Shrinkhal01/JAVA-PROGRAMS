import java.util.Scanner;
public class RatInMaze {
    public static void findPath(int[][] maze, int x, int y, int[][] solution, String path) {
        int n = maze.length;


        if (x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0 || solution[x][y] == 1) {
            return;
        }//this if condition checks if the current position is within bounds and is a path or not


        if (x == n - 1 && y == n - 1) {
            solution[x][y] = 1;
            System.out.println("Path: " + path);
            solution[x][y] = 0;
            return;
        }//this if condition checks if the destination is reached or not

        solution[x][y] = 1;// Mark as visited


        findPath(maze, x + 1, y, solution, path + "D"); // Down
        findPath(maze, x, y + 1, solution, path + "R"); // Right
        findPath(maze, x - 1, y, solution, path + "U"); // Up
        findPath(maze, x, y - 1, solution, path + "L"); // Left


        solution[x][y] = 0; // Unmark (backtrack 🥲)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the maze (n x n): ");
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        System.out.println("Enter the maze matrix (1 for path, 0 for blocked):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        System.out.println("Possible paths from start to destination:");
        findPath(maze, 0, 0, new int[n][n], "");
        sc.close();
    }
}
