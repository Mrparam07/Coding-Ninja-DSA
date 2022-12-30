public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.

	String s="";
	char ch=str.charAt(0);
	char c;
	int count=0;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(ch==c)
			count++;

			else{
				if(count>1)
			    s=s+ch+count;
				else
				s=s+ch;

				count=1;
			}
			ch=c;	
		}
			if(count>1)
			    s=s+ch+count;
				else
				s=s+ch;

		return s;
	}

}
