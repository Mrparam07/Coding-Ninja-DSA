
public class Solution {

	public static int minCostPath(int[][] input) {
		int dp[][] =new int[input.length+1][input[0].length+1];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		return helperA(input,0,0,dp);
		//Your code goes here
	}
	public static int helperA(int[][] input, int i, int j,int[][] dp)
	{
		if(input.length == 0)
		return 0;
		int n = input.length;
		int m = input[0].length;
		if(i==n-1 && j==m-1)
		return input[i][j];

		if(i>=n || j>=m)
		return Integer.MAX_VALUE;

		int ans1,ans2,ans3;
		if(dp[i+1][j] == Integer.MIN_VALUE)
		{
			ans1 = helper(input,i+1,j);
			dp[i+1][j] = ans1;
		}
		else
			ans1 = dp[i+1][j];

		if(dp[i][j+1] == Integer.MIN_VALUE)
		{
			ans2 = helper(input,i,j+1);
			dp[i][j+1] = ans2;
		}
		else
			ans2 = dp[i][j+1];

		if(dp[i+1][j+1] == Integer.MIN_VALUE)
		{
			ans3 = helper(input,i,j+1);
			dp[i+1][j+1] = ans3;
		}
		else
			ans3 = dp[i+1][j+1];
		
		
		int myAns = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
		return myAns;
	}
	public static int helper(int[][] input, int i, int j)
	{
		if(input.length == 0)
		return 0;
		int m = input.length;
		int n = input[0].length;
		if(i==n-1 && j==m-1)
		return input[i][j];

		if(i>=n || j>=m)
		return Integer.MAX_VALUE;

		int ans1 = helper(input,i+1,j);
		int ans2 = helper(input,i,j+1);
		int ans3 = helper(input,i+1,j+1);
		
		int myAns = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
		return myAns;
	}

}
