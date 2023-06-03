import java.util.Scanner;

public class GraphDFS {

    public static void main(String[] args) {
        //adjancy matrix
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
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                System.out.print(adjMat[i][j]+" ");
//            }
//            System.out.println();
//        }
        traversal(adjMat);
    }

    private static void traversal(int[][] adjMat) {
        boolean[] isVisited = new boolean[adjMat.length];

        for(int i=0;i< adjMat.length;i++) {
            if(!isVisited[i]) {
                traversalHelper(adjMat, i, isVisited);
                System.out.println();
            }
        }
    }

    private static void traversalHelper(int[][] adjMat, int currVer, boolean[] isVisited) {
        isVisited[currVer] = true;
        System.out.print(currVer + " ");
        for(int i=0;i<adjMat.length;i++)
        {
            if(adjMat[currVer][i] == 1 && isVisited[i] == false)
                traversalHelper(adjMat, i, isVisited);
        }
    }

}

