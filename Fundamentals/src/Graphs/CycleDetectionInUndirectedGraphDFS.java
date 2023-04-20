package Graphs;

import java.util.ArrayList;

public class CycleDetectionInUndirectedGraphDFS {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V + 1];
        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                if (checkForCycle(adj, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited, int parent) {
        visited[node] = true;
        for (Integer it : adj.get(node)) {
            if (!visited[it]) {
                if (checkForCycle(adj, it, visited, node)) {
                    return true;
                }
            } else if (parent != it) {
                return true;
            }
        }
        return false;
    }
}
