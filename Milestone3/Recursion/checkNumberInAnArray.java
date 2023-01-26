public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		if(input.length==0)
		return false;
		int n=input.length;
		
		if(input[0]==x)
		return true;
		int arr[] = new int[input.length-1];
		for(int i=1;i<n;i++)
		{
			arr[i-1]=input[i];
		}
		boolean result=checkNumber(arr, x);
		return result;
	}
}
