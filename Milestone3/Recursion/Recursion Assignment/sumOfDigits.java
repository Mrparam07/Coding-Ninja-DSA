
public class solution {

	public static int sumOfDigits(int input){
		// for last value of digit of the input value
	if(input/10==0)
	return input%10;
	int sum=input%10;
	//finding last value
	//and return the sum recursively
	return sum+sumOfDigits(input/10);
	}
}
