import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int adjMat[][] = new int[n][n];
        for(int i=0;i<e;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMat[v1][v2] = 1;
            adjMat[v2][v1] = 1;
        }
		if(n==0){
		System.out.print(true);
		return;
		}
		boolean ans = isConnected(adjMat);
		System.out.print(ans);

	}
	public static boolean isConnected(int graph[][])
	{
		boolean visited[] = new boolean[graph.length];
		DFS(graph, 0, visited);
		for(boolean i : visited)
		if(i == false )
		return false;

		return true;
	}
    private static void DFS(int[][] adjMat, int currVer, boolean[] isVisited) {
        isVisited[currVer] = true;
       // System.out.print(currVer + " ");
        for(int i=0;i<adjMat.length;i++)
        {
            if(adjMat[currVer][i] == 1 && isVisited[i] == false){
                isVisited[i] = true;
				DFS(adjMat, i, isVisited);

			}
        }
    }

}
