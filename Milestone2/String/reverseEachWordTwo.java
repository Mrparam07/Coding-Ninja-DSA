public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
		String[] word=input.split(" ");
		String rev="";
		String ans="";

		for(int i=0;i<word.length;i++)
		{
			String s=word[i];
			String r="";
			for(int j=s.length()-1;j>=0;j--)
			{
				r+=s.charAt(j);
			}
			rev=rev+r+" ";
		}
		for(int i=input.length()-1;i>=0;i--)
		{
				ans+=rev.charAt(i);
		}

	return ans;
	}
}
