import java.util.Arrays;
public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
		
		Arrays.sort(arr);
		int result=arr[0];
		for(int i=1;i<arr.length;i+=2)
		{
			if(arr[i-1]!=arr[i]){
			result= arr[i-1];
			break;
			}
			else
			result=arr[arr.length-1];

		}

		
		return result;
	}
}
