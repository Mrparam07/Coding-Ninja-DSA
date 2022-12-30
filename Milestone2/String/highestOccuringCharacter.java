
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here

		int n=str.length();
		char ch=' ';
		int count[]=new int[256];
		
		for(int i=0;i<n;i++)
		{
			count[str.charAt(i)]++;
			//count[i]=str.charAt(i);
		}

		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<count[str.charAt(i)])
			{
				max=count[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		return ch;
	}

}
