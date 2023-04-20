package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

class DijkstraAlgorithm
{
    static void shortestPath(int s, ArrayList<ArrayList<Node>> adj, int N)
    {
        int[] dist = new int[N];

        for(int i = 0;i<N;i++) dist[i] = 100000000;
        dist[s] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(s, 0));

        while(!pq.isEmpty()) {
            Node node = pq.poll();

            for(Node it: adj.get(node.getV())) {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()]) {
                    dist[it.getV()] = dist[node.getV()] + it.getWeight();
                    pq.add(new Node(it.getV(), dist[it.getV()]));
                }
            }
        }

        for (int i = 0; i < N; i++)
        {
            System.out.print( dist[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int n = 5;
        ArrayList<ArrayList<Node> > adj = new ArrayList<ArrayList<Node> >();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Node>());

        adj.get(0).add(new Node(1, 2));
        adj.get(1).add(new Node(0, 2));

        adj.get(1).add(new Node(2, 4));
        adj.get(2).add(new Node(1, 4));

        adj.get(0).add(new Node(3, 1));
        adj.get(3).add(new Node(0, 1));

        adj.get(3).add(new Node(2, 3));
        adj.get(2).add(new Node(3, 3));

        adj.get(1).add(new Node(4, 5));
        adj.get(4).add(new Node(1, 5));

        adj.get(2).add(new Node(4, 1));
        adj.get(4).add(new Node(2, 1));

        shortestPath(0,adj,n);
    }
}