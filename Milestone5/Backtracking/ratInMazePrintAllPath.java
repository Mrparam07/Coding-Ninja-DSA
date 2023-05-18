
public class Solution {


	static void ratInAMaze(int maze[][], int n) {
		int l = maze.length;
		int path[][] = new int[l][l];
		printPath(maze, 0, 0, path,n);
	}
	public static void printPath(int maze[][], int i, int j, int path[][],int n)
	{
		//int n = maze.length;
		if(  i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1 )
		return;

		path[i][j] = 1;

		if(i == n-1 && j == n-1)
		{
			for(int r=0;r<n;r++){
				for(int c=0;c<n;c++)
				{
					System.out.print(path[r][c]+" ");
				}
				//System.out.println();
			}
			path[i][j] = 0;
			System.out.println();
			return;
		}
		printPath(maze, i-1, j, path,n);
		printPath(maze, i, j+1, path,n);
		printPath(maze, i+1, j, path,n);
		printPath(maze, i, j-1, path,n);

		path[i][j] = 0;
	}

}
