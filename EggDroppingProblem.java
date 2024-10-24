import java.util.Scanner;

class EggDroppingProblem {

    // Function to get minimum number of trials needed in worst case
    public static int eggDrop(int eggs, int floors) {
        int[][] dp = new int[eggs + 1][floors + 1];
        for (int i = 1; i <= eggs; i++) {
            dp[i][0] = 0; // Zero floors
            dp[i][1] = 1; // One floor
        }// Base cases
        for (int j = 1; j <= floors; j++) {
            dp[1][j] = j; // One egg
        }
        for (int i = 2; i <= eggs; i++) {
            for (int j = 2; j <= floors; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    int res = 1 + Math.max(dp[i - 1][x - 1], dp[i][j - x]);
                    dp[i][j] = Math.min(dp[i][j], res);
                }
            }
        }//filling the rest of the table
        return dp[eggs][floors];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of eggs: ");
        int eggs = sc.nextInt();
        System.out.print("Enter the number of floors: ");
        int floors = sc.nextInt();
        int result = eggDrop(eggs, floors);//the function in use
        System.out.println("Minimum number of trials in worst case: " + result);
        sc.close();
    }
}
