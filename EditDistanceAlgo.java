import java.util.Scanner;

class EditDistanceAlgo {
    public static int minEditDistance(String str1, String str2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 0) {
                    dp[i][j] = i;
                }// If second string is empty, only option is to remove all characters of first string
                 else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }// If last characters are the same, ignore the last character and recur for remaining        
                else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }// If last characters are different, consider all possibilities and find the minimum
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        int m = str1.length();
        int n = str2.length();
        int result = minEditDistance(str1, str2, m, n);
        System.out.println("Minimum edit distance: " + result);
        sc.close();
    }
}
