import java.util.Arrays;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(i==j)
				continue;
				if(arr[i]+arr[j]==num)
				count++;
			}
		}
		return count;
	}
}
