
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				continue;
		
			result+=str.charAt(i);
		}
		return result;
	}

}
