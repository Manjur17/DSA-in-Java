package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyListImplementation {
    static void adjListImp() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  //no of vertices
        int e = s.nextInt(); //no of edges

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        //Taking edges as input
        for (int i = 0; i < e; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        //printing the graph
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> " );
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjListImp();
    }
}
