package Graphs;

class Node implements Comparable<Node> {
    private int v;
    private int weight;

    Node(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }

    int getV() {
        return v;
    }

    int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }
}
