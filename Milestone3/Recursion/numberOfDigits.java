public class Solution {

static int c=0;
	public static int count(int n){
		//Write your code here
		if(n==0)
		return 0;
		int smallOutput=count(n/10);
		
		c++;
		return c;
	}
}
