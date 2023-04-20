package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathsWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        printMazePaths(3, 3, 0, 0, "");
    }

    public static void printMazePaths(int m, int n, int i, int j, String ans) {

        if (i == m && j == n) {
            System.out.print(ans + " ");
            return;
        }

        for (int k = 1; k <= m - i && i < m; k++) {
            printMazePaths(m, n, i + k, j, ans + "h" + k);
        }

        for (int k = 1; k <= n - j && j < n; k++) {
            printMazePaths(m, n, i, j + k, ans + "v" + k);
        }

        for (int k = 1; (k <= m - i && k <= n - j); k++) {
            printMazePaths(m, n, i + k, j + k, ans + "d" + k);
        }
    }
}
