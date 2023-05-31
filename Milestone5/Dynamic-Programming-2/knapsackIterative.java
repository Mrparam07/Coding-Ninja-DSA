
public class Solution {

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {

		int W = maxWeight;	
		int dp[][] = new int[n+1][W+1];
	

		for(int i = n-1 ;i>=0;i--)
		{
			for(int j = 0; j <= W; j++)
			{
				if(weights[i]<=j){
					int ans1=dp[i+1][j];
					int ans2=dp[i+1][j-weights[i]] + values[i];
					dp[i][j]=Math.max(ans1, ans2);
				}
				else
				{
					dp[i][j]=dp[i+1][j];
				}
			}
		}
		return dp[0][W];
	}

}
