package Arrays2D;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] arr1 = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        int rows2 = s.nextInt();
        int columns2 = s.nextInt();
        int[][] arr2 = new int[rows2][columns2];
        //Taking input from user
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        int[][] ans = matrixMultiply(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixMultiply(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        if (c1 != r2) return new int[0][0];
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return ans;
    }
}
