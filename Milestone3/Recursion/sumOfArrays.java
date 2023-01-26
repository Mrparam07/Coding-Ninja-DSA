public class Solution {
    int input[];
	int n;
	int result;
	public static int sum(int input[]) {
		if(input.length==0)
		return 0;
		int arr[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			arr[i-1]=input[i];
		}
		int output=input[0]+sum(arr);
		return output;
	}
}
