package BackTracking;

import java.util.ArrayList;

public class RatInAMazeProblem {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        //boolean visited[][] = new boolean[n][n]; not needed

        findHelper(0, 0, m, m.length, m[0].length, "", ans);

        if (ans.size() == 0) {
            ans.add("-1");
        }

        return ans;
    }

    public static void findHelper(int i, int j, int[][] arr, int n, int m, String str, ArrayList<String> ans) {
        if (i < 0 || i >= n || j < 0 || j >= m || arr[i][j] == 0 ) {
            return;
        }


        if (i == n - 1 && j == m - 1) {
            ans.add(str);
            return;
        }

        arr[i][j] = 0; // mark visited

        findHelper(i + 1, j, arr, n, m, str + "D", ans); //down
        findHelper(i - 1, j, arr, n, m, str + "U", ans); //up
        findHelper(i, j + 1, arr, n, m, str + "R", ans); //right
        findHelper(i, j - 1, arr, n, m, str + "L", ans); //left

        arr[i][j] = 1;
    }

    public static void findHelper(int i, int j, int[][] arr, int n, int m, String str, ArrayList<String> ans, boolean[][] visited) {
        if (i < 0 || i >= n || j < 0 || j >= m || arr[i][j] == 0 || visited[i][j]) {
            return;
        }


        if (i == n - 1 && j == m - 1) {
            ans.add(str);
            return;
        }

        visited[i][j] = true;

        findHelper(i + 1, j, arr, n, m, str + "D", ans, visited); //down
        findHelper(i - 1, j, arr, n, m, str + "U", ans, visited); //up
        findHelper(i, j + 1, arr, n, m, str + "R", ans, visited); //right
        findHelper(i, j - 1, arr, n, m, str + "L", ans, visited); //left

        visited[i][j] = false;
    }
}
