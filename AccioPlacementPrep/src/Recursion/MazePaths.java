package Recursion;

import java.util.ArrayList;

public class MazePaths {
    public static void main(String[] args) {
        System.out.println(numberOfPaths(3, 3));
        ArrayList<String> ans = new ArrayList<>();
        getMazePaths(3, 3, 0, 0, "", ans);
    }

    static long numberOfPaths(int m, int n) {
        return helper(m, n, 0, 0, "");
    }

    static long helper(int m, int n, int i, int j, String ans) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            System.out.print(ans + " ");
            return 1;
        }

        long count = 0;

        count += helper(m, n, i + 1, j, ans + "R");
        count += helper(m, n, i, j + 1, ans + "D");


        return count;

    }

    //Returning an arraylist
    public static void getMazePaths(int m, int n, int i, int j, String str, ArrayList<String> ans) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        if (i == m - 1 && j == n - 1) {
            ans.add(str);
            return;
        }

        getMazePaths(m, n, i + 1, j, ans + "R", ans);
        getMazePaths(m, n, i, j + 1, ans + "D", ans);
    }
}
