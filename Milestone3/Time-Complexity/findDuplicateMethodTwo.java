
public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int r=((arr.length-2)*(arr.length-1))/2;
		return sum-r;
	}
}
