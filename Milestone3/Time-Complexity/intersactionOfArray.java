//Intersaction of two array
//Time Complexity square of two


public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here

		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]){
				System.out.print(arr1[i]+" ");
				arr1[i]=0;
				arr2[j]=0;
				break;
				}
			}
		}
	}

}
