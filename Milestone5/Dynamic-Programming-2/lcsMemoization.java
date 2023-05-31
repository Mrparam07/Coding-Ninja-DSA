
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int dp[][] = new int[s.length()+1][t.length()+1];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j] = -1;
			}
		}
		return helperA(s,t,0,0,dp);
    }
	public static int helperA(String s, String t, int i, int j,int dp[][])
	{
		if(i==s.length() || j == t.length())
		return 0;
		int myAns;
		
		if(s.charAt(i) == t.charAt(j))
		{
			int smallAns;
			if(dp[i+1][j+1] == -1){
			smallAns = helper(s,t,i+1,j+1);
			dp[i+1][j+1] = smallAns;
			}
			else
			smallAns = dp[i+1][j+1];

			myAns = 1+smallAns;
		}
		else{
		int ans1, ans2;
		if(dp[i+1][j] == -1){
			ans1 = helper(s,t,i+1,j);
			dp[i+1][j] = ans1;
		}
		else
		 ans1= dp[i+1][j];

		 if(dp[i][j+1] == -1){
			ans2 = helper(s,t,i,j+1);
			dp[i][j+1] = ans2;
		}
		else
		 ans2= dp[i][j+1];
		myAns =  Math.max(ans1,ans2);
		}
		return myAns;
	}
	public static int helper(String s, String t, int i, int j)
	{
		if(i==s.length() || j == t.length())
		return 0;

		if(s.charAt(i) == t.charAt(j))
		return 1 + helper(s,t,i+1,j+1);
		else
		return Math.max(helper(s,t,i+1,j), helper(s,t,i,j+1));
	}

}
