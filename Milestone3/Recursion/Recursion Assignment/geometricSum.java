
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
		//System.out.println(k);
		if(k==0)
		return 1;
		double output=findGeometricSum(k-1);
		//k-1 indicating the function call
		//System.out.println(k);
		//now the value of k is decreement by one
		return output+1/(Math.pow(2,k));
	}
}
