import java.util.*;
import java.util.Queue;
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

        boolean pathExists = hasPath(graph, v1, v2);
        System.out.println(pathExists);

        sc.close();
    }

    public static boolean hasPathDFS(int[][] graph, int startVertex, int endVertex, boolean[] visited) {
        visited[startVertex] = true;

        if (startVertex == endVertex) {
            return true;
        }

        for (int i = 0; i < graph.length; i++) {
            if (graph[startVertex][i] == 1 && !visited[i]) {
                if (hasPathDFS(graph, i, endVertex, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean hasPath(int[][] graph, int v1, int v2) {
        int numVertices = graph.length;
        boolean[] visited = new boolean[numVertices];
        return hasPathDFS(graph, v1, v2, visited);
    }

   
}
