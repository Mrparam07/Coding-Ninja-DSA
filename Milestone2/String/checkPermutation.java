
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here

		// int count=0;
		// if(str1.length()!=str2.length())
		// return false;
		// for(int i=0;i<str1.length();i++)
		// {
		// 	for(int j=0;j<str2.length();j++)
		// 	{
		// 		if(str1.charAt(i)==str2.charAt(j))
		// 		count++;
		// 	}
		// }
		// // System.out.println(count);
		// // System.out.println(str1.length()*str2.length());
		// if(count ==str1.length())
		// return true;
		// else 
		// return false;
		String input1=str1;
		String input2=str2;
		int frequencyArr[]=new int[256];
  int count=0;
for(int i=0;i<input1.length();i++){
int cha=input1.charAt(i);
    frequencyArr[cha]=frequencyArr[cha]+1;}
    for(int i=0;i<input2.length();i++)
    {
        int ch=input2.charAt(i);
        frequencyArr[ch]=frequencyArr[ch]-1;
 }
    for(int i=0;i<256;i++)
    {
        if(frequencyArr[i]==0)
            count++;
    }
    if(count==256)
        return true;
    else
        return false;
	}

}
