package Graphs;

import java.util.ArrayList;

class GNode
{
    private int u;
    private int v;
    private int weight;

    GNode(int u, int v, int weight) {
        this.u = u; this.v = v; this.weight = weight;
    }

    GNode() {}

    int getV() { return v; }
    int getU() { return u; }
    int getWeight() { return weight; }

}
public class BellmanFordAlgorithm {
    static void bellmanFord(ArrayList<GNode> edges, int N, int src)
    {
        int[] dist = new int[N];
        for(int i = 0;i<N;i++) dist[i] = 10000000;

        dist[src] = 0;

        for(int i = 1;i<=N-1;i++) {
            for(GNode node : edges) {
                if(dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
                    dist[node.getV()] = dist[node.getU()] + node.getWeight();
                }
            }
        }

        int flag = 0;
        for(GNode node: edges) {
            if(dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
                flag = 1;
                System.out.println("Negative Cycle");
                break;
            }
        }

        if(flag == 0) {
            for(int i = 0;i<N;i++) {
                System.out.println(i + " " + dist[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        int n = 6;
        ArrayList<GNode> adj = new ArrayList<>();


        adj.add(new GNode(3, 2, 6));
        adj.add(new GNode(5, 3, 1));
        adj.add(new GNode(0, 1, 5));
        adj.add(new GNode(1, 5, -3));
        adj.add(new GNode(1, 2, -2));
        adj.add(new GNode(3, 4, -2));
        adj.add(new GNode(2, 4, 3));


        bellmanFord(adj, n, 0);

    }
}
