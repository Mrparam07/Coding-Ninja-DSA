
public class Solution {
	
		
     public static int staircase(int n){
		
		if(n<0)
		return 0;
		 if(n==0)
		 return 1;
		int n1=staircase(n-1);
		int n2=staircase(n-2);
		int n3=staircase(n-3);
		return n1+n2+n3;
	}
	
}
