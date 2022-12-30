
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here

		String rev="";
		
		String[] word=str.split(" ");

		for(int i=0;i<word.length;i++)
		{
			String w=word[i];
			String r="";
			for(int j=w.length()-1;j>=0;j--)
			{
				r=r+w.charAt(j);
			}
			rev=rev+r+" ";
		}
		return rev;
	}

}
