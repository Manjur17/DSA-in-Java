package Graphs;

import java.util.Scanner;

public class AdjacencyMatrixImplementation {
    static void adjMatrixImp(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  //no of vertices
        int e = s.nextInt(); //no of edges
        int[][] adjMatrix = new int[n][n];
        //Taking edges as input
        for (int i = 0; i < e; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }

        //printing the adjacency matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjMatrixImp();
    }
}
