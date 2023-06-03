import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
         
        Scanner sc = new Scanner(System.in);
        int numVertices = sc.nextInt();
        int numEdges = sc.nextInt();

        int[][] graph = new int[numVertices][numVertices];
        for (int i = 0; i < numEdges; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1; // Since the graph is undirected
        }

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        boolean visited[] = new boolean[numVertices];
		ArrayList<Integer> ans = getPath(graph, v1, v2, visited);
		if(ans != null){
			for(int i : ans)
			System.out.print(i+ " ");
		}
	}
	public static ArrayList<Integer> getPath(int graph[][], int v1, int v2, boolean visited[])
	{
		if(v1 == v2)
		{
			ArrayList<Integer> ans = new ArrayList<>();
			visited[v1] = true;
			ans.add(v1);
			return ans;
		}
		visited[v1] = true;
		for(int i=0;i<graph.length;i++)
		{
			if(graph[v1][i] == 1 && !visited[i]){
				
				ArrayList<Integer> arr = getPath(graph, i, v2, visited);
				if(arr != null){
					arr.add(v1);
					return arr;
				}
			}
		}
		return null;
	}
}
