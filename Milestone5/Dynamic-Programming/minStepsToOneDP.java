public class Solution {

	public static int countMinStepsToOne(int n) {
		int dp[] = new int[n+1];
		dp[1] = 0;

		for(int i=2;i<dp.length;i++)
		{
			int a = Integer.MAX_VALUE;
			int b = Integer.MAX_VALUE;
			int c = Integer.MAX_VALUE;
			a = dp[i-1];
			if(i%2 == 0)
			b = dp[i/2];
			if(i%3 == 0)
			c = dp[i/3];

			dp[i] = Math.min(a, Math.min(b, c))+1;
		}
		return dp[n];
	}

}
