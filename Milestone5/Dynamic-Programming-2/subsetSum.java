public class Solution{
    static boolean isSubsetPresent(int[] arr, int n, int sum) {

        int s[] = arr;
         boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= sum; i++) {
            dp[0][i] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= s[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - s[i - 1]];
                }
            }
        }

        return dp[n][sum];

    }
}
