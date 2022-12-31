public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here

		int n=input.length;
		int c=0;
		for(int i=0;i<input.length;i++)
		{
			c=0;
			while(c<n-i)
			{
			for(int j=0;j<input[0].length;j++)
			{
				
					System.out.print(input[i][j]+" ");
				
			}
				c++;
			System.out.println();
			}
		}
	}
}
