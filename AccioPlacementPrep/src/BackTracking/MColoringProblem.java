package BackTracking;

import java.util.Arrays;

public class MColoringProblem {
    public boolean graphColoring(boolean[][] graph, int m, int n) {

        // Try out the possible ways

        int[] color = new int[n];

        Arrays.fill(color, -1);

        return Solve(graph, color, 0, m);

    }

    public boolean Solve(boolean[][] graph, int[] color, int ind, int m) {

        if (ind == graph.length)

            return true;

        for (int i = 1; i <= m; i++) {

            if (isValid(graph, color, ind, i)) {

                color[ind] = i;

                if (Solve(graph, color, ind + 1, m)) return true;

                color[ind] = -1;

            }

        }

        return false;

    }


    public boolean isValid(boolean[][] graph, int[] color, int ind, int m) {

        // Checking for adjacent nodes color

        for (int i = 0; i < graph[ind].length; i++) {

            if (graph[ind][i]) {

                if (color[i] == m) return false;

            }

        }


        return true;

    }
}