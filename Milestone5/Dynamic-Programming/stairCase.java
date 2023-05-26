public class Solution {

	public static long staircase(int n) {
		//Your code goes here
		if(n<0)
		return 0;
		if(n==0)
		return 1;
		long a=staircase(n-1);
		long b=staircase(n-2);
		long c=staircase(n-3);
		return a+b+c;
	}

}
