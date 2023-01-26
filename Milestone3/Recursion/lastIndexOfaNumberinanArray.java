
public class Solution {

	public static int lastIndex(int input[], int x) {
		return check(input,x,input.length-1);
	}
	public static int check(int arr[],int x,int li)
	{
		if(li==-1)
		return -1;
		if(arr[li]==x)
		return li;
		return check(arr,x,li-1);
	}
}
