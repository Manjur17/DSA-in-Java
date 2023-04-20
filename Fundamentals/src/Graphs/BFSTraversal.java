package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    public static ArrayList<Integer> bfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfsList = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];
        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                visited[i] = true;
                while (!queue.isEmpty()) {
                    Integer node = queue.poll();
                    bfsList.add(node);
                    for (Integer it : adj.get(node)) {
                        if (!visited[it]) {
                            visited[it] = true;
                            queue.add(it);
                        }
                    }
                }
            }
        }
        return bfsList;
    }
}
