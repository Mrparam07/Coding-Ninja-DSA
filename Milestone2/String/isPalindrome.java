
public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		
		if(str.equals(rev))
		return true;
		else
		return false;
	}

}
