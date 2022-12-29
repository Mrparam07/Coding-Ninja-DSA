
public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
		try{
		for(int i=0;i<mat[0].length;i++)
		{	
			
			if(i%2==0)
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			else{
				for(int j=mat.length-1;j>=0;j--)
				{
					System.out.print(mat[j][i]+" ");
				}
			}
		}
		}catch(Exception e){
			System.out.println();
		}
	}

}
