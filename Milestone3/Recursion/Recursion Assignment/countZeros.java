
public class solution {

	public static int countZerosRec(int input){
		if(input<10){
		if(input==0)
		return 1;
		else
		return 0;
		}
		//int output=input%10;
		if(input%10==0)
		return 1+countZerosRec(input/10);
		else
		return 0+countZerosRec(input/10);
		
	}
}
