
public class Solution {

	public static int firstIndex(int input[], int x) {
		
		return check(input,x,0);
	}
	public static int check(int arr[],int x,int si)
	{
		if(arr.length-1==si)
		return -1;
		if(arr[si]==x)
		return si;
		return check(arr,x,si+1);
	}
	
}
