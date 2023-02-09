import java.util.Arrays;
public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here

		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			return arr[i];
		}
	return -1;
	}
}
