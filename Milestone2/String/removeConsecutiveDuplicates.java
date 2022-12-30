public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here

		String result="";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
					result+=str.charAt(i);
			}
		}
		int n=str.length()-1;
		result+=str.charAt(n);
		return result;
	}

}
