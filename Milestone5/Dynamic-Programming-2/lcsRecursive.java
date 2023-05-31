
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		return helper(s,t,0,0);
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
