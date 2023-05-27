public class Solution {

	public static int minCount(int n) {
		int dp[] = new int[n+1];
		for(int i=0;i<dp.length;i++)
		{
			dp[i] = -1;
		}
		return helper(n, dp);
	}
	public static int helper(int n, int dp[])
	{
		if(n==0)
		return 0;

		int minAns = Integer.MAX_VALUE;
		for(int i=1;i*i <=n;i++)
		{
			int currAns;
			if(dp[n-(i*i)] == -1){
				currAns = helper(n-(i*i),dp);
				dp[n-(i*i)] = currAns;
			}
			else
			currAns = dp[n-(i*i)];
			if(minAns > currAns)
			minAns = currAns;
		}
		return 1+minAns;
	}
	

}
