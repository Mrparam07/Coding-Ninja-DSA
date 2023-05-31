
public class Solution {

	public static int minCostPath(int[][] input) {
		
		int n = input.length;
		int m = input[0].length;
		int dp[][] = new int[n+1][m+1];

		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		int ans1,ans2,ans3;
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<m+1;j++)
			{
				if(i == 1 && j== 1){
					dp[i][j] = input[0][0];
					continue;
				}
				else{
				 ans1 = dp[i-1][j];
				 ans2 = dp[i][j-1];
				 ans3 = dp[i-1][j-1];
				}

				dp[i][j] = input[i-1][j-1]+Math.min(ans1, Math.min(ans2,ans3));
			}
		}
		return dp[n][m];
	}
}
