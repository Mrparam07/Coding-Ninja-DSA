
public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
		int sumR=0,sumC=0,r=0,c=0;
		int i,j;
		int largestR=Integer.MIN_VALUE;
		int largestC=Integer.MIN_VALUE;
		try{
		
		for( i=0;i<mat.length;i++)
		{
			sumR=0;
			for( j=0;j<mat[0].length;j++)
			{
				sumR+=mat[i][j];
			}
			if(sumR>largestR){
			largestR=sumR;
			r=i;
			}
		}
		
      
		for(i=0;i<mat[0].length;i++)
		{
			sumC=0;
			for( j=0;j<mat.length;j++)
			{
				sumC+=mat[j][i];
			}
			if(sumC>largestC){
			largestC=sumC;
			c=i;
			}
		}
	
		if(largestR>=largestC)
		{
			System.out.print("row "+r+" "+largestR);
		}
		else
		System.out.print("column "+c+" "+largestC);
		}catch(Exception e)
		{
			System.out.print("row "+r+" "+largestR);
		}
	}

}
