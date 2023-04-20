package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class BipartiteGraphDFS {
    public boolean checkBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V + 1];
        Arrays.fill(color, -1);
        for (int i = 1; i <= V; i++) {
            if (color[i] == -1) {
                if (!dfsCheck(adj, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
        if (color[node] == -1) {
            color[node] = 1;
        }
        for (Integer it : adj.get(node)) {
            if (color[it] == -1) {
                color[it] = 1 - color[node];

                if (!dfsCheck(adj, it, color))
                    return false;
            } else if (color[it] == color[node]) {
                return false;
            }
        }
        return true;
    }
}
