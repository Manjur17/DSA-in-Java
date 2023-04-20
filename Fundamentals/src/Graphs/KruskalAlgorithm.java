package Graphs;

import java.util.*;

class GraphNode implements Comparable<GraphNode> {
    private int u;
    private int v;
    private int weight;

    GraphNode(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    GraphNode() {
    }

    int getV() {
        return v;
    }

    int getU() {
        return u;
    }

    int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(GraphNode o) {
        return this.weight - o.weight;
    }
}

class KruskalAlgorithm {

    static private int findPar(int u, int[] parent) {
        if (u == parent[u]) {
            return u;
        }
        return parent[u] = findPar(parent[u], parent);
    }

    static private void union(int u, int v, int[] parent, int[] rank) {
        u = findPar(u, parent);
        v = findPar(v, parent);
        if (rank[u] < rank[v]) {
            parent[u] = v;
        } else if (rank[v] < rank[u]) {
            parent[v] = u;
        } else {
            parent[v] = u;
            rank[u]++;
        }
    }

    static void kruskalAlgo(ArrayList<GraphNode> adj, int N) {
//        adj.sort(new SortComparator());
        Collections.sort(adj);
        int[] parent = new int[N];
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int costMst = 0;
        ArrayList<GraphNode> mst = new ArrayList<>();
        for (GraphNode it : adj) {
            if (findPar(it.getU(), parent) != findPar(it.getV(), parent)) {
                costMst += it.getWeight();
                mst.add(it);
                union(it.getU(), it.getV(), parent, rank);
            }
        }
        System.out.println("Minimum Cost Spanning Tree " + costMst);
        for (GraphNode it : mst) {
            System.out.println(it.getU() + " " + it.getV());
        }
    }

    public static void main(String args[]) {
        int n = 5;
        ArrayList<GraphNode> adj = new ArrayList<>();

        adj.add(new GraphNode(0, 1, 2));
        adj.add(new GraphNode(0, 3, 6));
        adj.add(new GraphNode(1, 3, 8));
        adj.add(new GraphNode(1, 2, 3));
        adj.add(new GraphNode(1, 4, 5));
        adj.add(new GraphNode(2, 4, 7));

        kruskalAlgo(adj, n);

    }
}
