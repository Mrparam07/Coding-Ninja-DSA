import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution {
	
	public static void main(String[] args)  throws NumberFormatException, IOException{
       
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
		ArrayList<Integer> ans = getPathBFS(graph, v1, v2, visited);
		if(ans != null){
			for(int i : ans)
			System.out.print(i+ " ");
		}
	}
	public static ArrayList<Integer> getPathBFS(int graph[][], int s, int e, boolean visited[])
	{
		Queue<Integer> penVer = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		visited[s] = true;
		penVer.add(s);
		map.put(s, -1);
		boolean pathFound = false;
		while(!penVer.isEmpty())
		{
			int curVer = penVer.poll();
			for(int i=0;i<graph.length;i++)
			{
				if(graph[curVer][i] == 1 && !visited[i])
				{
					penVer.add(i);
					visited[i] = true;
					map.put(i, curVer);
					if( i == e)
					{
						pathFound = true;
						break;
					}
				}
			}
		}
		if(pathFound)
		{
			ArrayList<Integer> path = new ArrayList<>();
			int curVer = e;
			while(curVer != -1){
				path.add(curVer);
				int parent = map.get(curVer);
				curVer = parent;
			}
			return path;
		}
		else
		return null;
	}
}
