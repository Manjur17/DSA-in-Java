package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second; //parent

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class CycleDetectionInUndirectedGraphBFS {
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        Queue<Pair> q = new LinkedList<>(); //BFS
        q.add(new Pair(s, -1));
        visited[s] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for (Integer it : adj.get(node)) {
                if (!visited[it]) {
                    q.add(new Pair(it, node));
                    visited[it] = true;
                } else if (parent != it) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V + 1];
        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                if (checkForCycle(adj, i, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
