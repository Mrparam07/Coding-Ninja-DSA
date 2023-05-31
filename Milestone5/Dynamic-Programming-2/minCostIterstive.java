
public class Solution {

	public static int minCostPath(int[][] input) {
		
		int dp[][] = new int[input.length+1][input[0].length+1];
		int n = input.length;
		int m = input[0].length;

		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=m-1;j>=0;j--)
			{
				if(i == n-1 && j== m-1){
					dp[i][j] = input[i][j];
					continue;
				}
				int ans1 = dp[i+1][j];
				int ans2 = dp[i][j+1];
				int ans3 = dp[i+1][j+1];

				dp[i][j] = input[i][j]+Math.min(ans1, Math.min(ans2,ans3));
			}
		}
		return dp[0][0];
	}
}
