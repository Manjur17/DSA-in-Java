package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] input = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                input[i][j] = s.nextInt();
            }
        }
        setZeroes(input);
        System.out.println(Arrays.deepToString(input));
    }

    public void setZeroesII(int[][] matrix) {
        //We can use the first cell of every row and column as a flag.
        // This flag would determine whether a row or column has been set to zero.
        //so we will store zero as flag in first cell of a row or column if we need to set that row or column zero
        int m = matrix.length;
        int n = matrix[0].length;
        int i, j;
        // for row = 0 and col = 0, there stored 0 can be for row or column
        boolean zeroThRow = false;
        boolean zeroThCols = false;
        for (i = 0; i < m; i++) {

            for (j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0; // that will show that we need to make all ele of ith row zero
                    matrix[0][j] = 0; // that will show that we need to make all ele of ith column zero
                }

                if (matrix[i][j] == 0 && i == 0) {
                    zeroThRow = true;
                }

                if (matrix[i][j] == 0 && j == 0) {
                    zeroThCols = true;
                }
            }
        }

        for (i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (i = 1; i < n; i++) {
            if (matrix[0][i] == 0) {
                for (j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (zeroThCols) {
            for (i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        if (zeroThRow) {
            for (j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    static void setZeroesEfficient(int[][] matrix) {
        //Here, instead of dedicating extra space for dummy array we used the matrix's column 0 and row 0 as our tracker for 0 value.
        boolean flag = true;
        int m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0)
                flag = false;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if (!flag)
                matrix[i][0] = 0;
        }
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        Arrays.fill(rows, -1);
        Arrays.fill(cols, -1);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] == 0 || cols[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
