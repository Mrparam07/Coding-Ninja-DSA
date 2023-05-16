public class solution {

public static String option(int n)
	{
		if(n==2)
		return "abc";
		if(n==3)
		return "def";
		if(n==4)
		return "ghi";
		if(n==5)
		return "jkl";
		if(n==6)
		return "mno";
		if(n==7)
		return "pqrs";
		if(n==8)
		return "tuv";
		if(n==9)
		return "wxyz";

		return "";
	}
	public static void printKeypadHelper(int input, String soFar)
	{
		if(input == 0){
			System.out.println(soFar);
			return;
		}

		int lastDigit = input%10;
		int smallOutput = input/10;
		String lastDigitOption = option(lastDigit);

		for(int i=0;i<lastDigitOption.length();i++)
		{
			printKeypadHelper(smallOutput, lastDigitOption.charAt(i) + soFar);
		}
	}
	public static void printKeypad(int input){
		printKeypadHelper(input,"");
	}
}
