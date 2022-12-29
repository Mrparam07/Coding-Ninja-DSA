
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here


		int sum;
		for(int i=0;i<mat.length;i++)
		{
			sum=0;
			for(int j=0;j<mat[0].length;j++)
			{
					sum=sum+mat[i][j];
			}
			System.out.print(sum+" ");
		}
	}

}
