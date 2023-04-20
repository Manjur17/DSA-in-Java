package RecursionHardProblemsAndBacktracking;

import java.util.List;

public class MColoringProblem {
    public boolean isValid(boolean graph[][], int colours[], int node, int color) {

        for (int i = 0; i < graph[node].length; i++) {

            if (graph[node][i] == true) {

                if (colours[i] == color) return false;

            }

        }

        return true;

    }

    public boolean helper(int node, boolean graph[][], int m, int n, int colours[]) {

        if (node == n) {

            return true;

        }

        for (int i = 0; i < m; i++) {

            if (isValid(graph, color, node, i)) {
                colours[node] = i;

                if (helper(node + 1, graph, m, n, colours) return true;

                colours[node] = 0;

            }

        }


        return false;

    }


    public boolean graphColoring(boolean graph[][], int m, int n) {

        int colours[] = new int[n];

        Arrays.fill(colours, 0);

        return helper(0, graph, m, n, colours);


    }
}
