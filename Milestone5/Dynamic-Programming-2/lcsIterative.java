
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int n = s.length();
		int m = t.length();

		int dp[][] = new int[n+1][m+1];
	
		for(int i = n-1;i>=0;i--){
			for(int j = m-1 ;j>=0 ;j--)
			{
				int ans;
				if(s.charAt(i) == t.charAt(j))
				ans = 1 + dp[i+1][j+1];
				else{
					int ans1 = dp[i+1][j];
					int ans2 = dp[i][j+1];
					ans = Math.max(ans1,ans2);
				}
				dp[i][j] = ans;
			}
		}
		return dp[0][0];
    }

}
