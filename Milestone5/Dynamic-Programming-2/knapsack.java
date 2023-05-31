
public class Solution {

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
		return helper(weights,values,n,maxWeight,0);
	}
	public static int helper(int[] weights, int[] values, int n, int maxWeight,int i){

		int ans;
		if( i == weights.length)
		return 0;
		if(weights[i] <= maxWeight){
			int ans1 = values[i] + helper(weights, values, n, maxWeight - weights[i], i+1);
			int ans2 = helper(weights, values, n, maxWeight, i+1);
			ans = Math.max(ans1, ans2);
		}
		else{
			ans = helper(weights, values, n, maxWeight, i+1);
		}
	return ans;
	}

}
