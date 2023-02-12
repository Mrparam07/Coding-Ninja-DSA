import java.util.Arrays;
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
		 int max=0,profit=0;
    int count=0;
	int n=budget.length;
    
	Arrays.sort(budget);
	for(int i=0;i<n;i++)
	{
		
		profit=budget[i]*(n-i);
		//System.out.print(profit+" ");
		if(profit>=max)
		max=profit;
	}
	return max;
	}

}
