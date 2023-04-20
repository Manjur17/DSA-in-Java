package Graphs;

import java.util.ArrayList;

public class DFSTraversal {
    public static ArrayList<Integer> dfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfsList = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];
        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj, dfsList);
            }
        }
        return dfsList;
    }

    private static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfsList) {
        dfsList.add(node);
        visited[node] = true;
        for (Integer it : adj.get(node)) {
            if (!visited[it]) {
                dfs(it, visited, adj, dfsList);
            }
        }
    }
}
