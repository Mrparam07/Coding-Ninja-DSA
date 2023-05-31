
public class Solution {

	public static int minCostPath(int[][] input) {
		return helper(input,0,0);
		//Your code goes here
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
