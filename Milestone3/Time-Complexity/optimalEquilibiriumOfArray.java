public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int i=0;
		int rightsum=0;
		int leftsum=0;
		while(i<arr.length)
		{
			rightsum=sum-leftsum-arr[i];
			if(leftsum==rightsum)
			return i;
			else
			{
				leftsum+=arr[i];
				i++;
			}
		}
		return -1;
	}
}
