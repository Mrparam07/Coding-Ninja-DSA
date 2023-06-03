import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
        
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
		if(n == 0)
		return;
        int adjMat[][] = new int[n][n];
        for(int i=0;i<e;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMat[v1][v2] = 1;
            adjMat[v2][v1] = 1;
        }
		 bfsDisconnectedGraph(adjMat);
	}
	public static void bfsTraversal(int[][] graph, int startVertex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < graph.length; i++) {
                if (graph[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void bfsDisconnectedGraph(int[][] graph) {
        int numVertices = graph.length;
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                bfsTraversal(graph, i, visited);
            }
        }
    }
}
