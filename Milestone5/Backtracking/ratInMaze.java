
public class Solution {

	public static boolean ratInAMaze(int maze[][]){

		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze, 0, 0, path);
	}
	public static boolean solveMaze(int maze[][], int i, int j, int path[][])
	{
		int n = maze.length;
		if(  i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1 )
		return false;

		//initilizing the path value to one
		path[i][j] = 1;

		//if there exist a path
		if(i == n-1 && j == n-1)
		return true;

		//top
		if(solveMaze(maze, i-1, j, path))
		return true;
		//right
		if(solveMaze(maze, i, j+1, path))
		return true;
		//down
		if(solveMaze(maze, i+1, j, path))
		return true;
		//left
		if(solveMaze(maze, i, j-1, path))
		return true;

		return false;
	}
}
