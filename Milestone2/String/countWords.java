public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
		int count=1;
		if(str.length()==0)
		return 0;
		else{
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			count++;
		}
		return count;
	}
	}

}
