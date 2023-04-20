package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraphBFS {
    private boolean bfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;
        while (!q.isEmpty()) {
            Integer nde = q.poll();

            for (Integer it : adj.get(nde)) {
                if (color[it] == -1) {
                    color[it] = 1 - color[nde];
                    q.add(it);
                } else if (color[it] == color[nde]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V + 1];
        Arrays.fill(color, -1);
        for (int i = 1; i <= V; i++) {
            if (color[i] == -1) {
                if (!bfsCheck(adj, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }
}
