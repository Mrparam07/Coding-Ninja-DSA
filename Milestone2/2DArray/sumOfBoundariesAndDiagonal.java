
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
		int sum=0;

		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(i==j || (i+j)==mat.length-1)
				{
					sum+=mat[i][j];
				}
				else if(i==0||j==0||i==mat.length-1||j==mat.length-1)
				sum+=mat[i][j];
			}
		}
		System.out.print(sum);
	}

}
