package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[m][n];
        //Taking input from user
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int[][] ans = matrixReshape(arr, r, c);
        System.out.println(Arrays.deepToString(ans));
    }

    public int[][] matrixReshapeAnother(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        int[][] ans = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        return ans;
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int l = mat.length, m = mat[0].length;
        if (l * m < r * c || l * m > r * c) return mat;
        int[][] ans = new int[r][c];
        int[] extra = new int[l * m];
        int k = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                extra[k] = mat[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(extra));
        k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = extra[k];
                k++;
            }
        }
        return ans;
    }

    //without using extra space
    public int[][] matrixReshape2(int[][] mat, int r, int c) {
        int l = mat.length, m = mat[0].length;
        if (l * m != r * c) return mat;
        int[][] ans = new int[r][c];
        int row = 0, cols = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                ans[row][cols] = mat[i][j];
                cols++;
                if (cols == c) {
                    cols = 0;
                    row++;
                }
            }
        }
        return ans;
    }

}
