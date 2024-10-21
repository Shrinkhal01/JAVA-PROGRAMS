import java.util.Scanner;
public class KnapsackAlgo {
    public static int knapsack01(int W, int[] weights, int[] values, int n) {
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        System.out.println("Enter weights and values of items:");
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " Weight: ");
            weights[i] = scanner.nextInt();
            System.out.println();
            System.out.print("Item " + (i + 1) + " Value: ");
            values[i] = scanner.nextInt();
            System.out.println();
        }
        System.out.print("Enter maximum weight capacity of the knapsack: ");
        int W = scanner.nextInt();
        int maxProfit = knapsack01(W, weights, values, n);
        System.out.println();
        System.out.println("Maximum profit: " + maxProfit);
        scanner.close();
    }
}
