package Arrays2D;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        diagonalTraversalN_N(arr);
    }

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Input matrix is null");
        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int r = 0;
        int c = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];
            if ((r + c) % 2 == 0) { // Move Up
                if (c == n - 1) {
                    // Reached last column. Now move to below cell in the same column.
                    // This condition needs to be checked first due to top right corner cell.
                    r++;
                } else if (r == 0) {
                    // Reached first row. Now move to next cell in the same row.
                    c++;
                } else {
                    // Somewhere in middle. Keep going up diagonally.
                    r--;
                    c++;
                }
            } else { // Move Down
                if (r == m - 1) {
                    // Reached last row. Now move to next cell in same row.
                    // This condition needs to be checked first due to bottom left corner cell.
                    c++;
                } else if (c == 0) {
                    // Reached first columns. Now move to below cell in the same column.
                    r++;
                } else {
                    // Somewhere in middle. Keep going down diagonally.
                    r++;
                    c--;
                }
            }
        }

        return result;
    }

    private static void diagonalTraversalN_N(int[][] arr) {
        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

}
