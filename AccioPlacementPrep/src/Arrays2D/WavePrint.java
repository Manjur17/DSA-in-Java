package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] arr = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int[] ans = wavePrint(arr, rows, columns);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] wavePrint(int[][] arr, int nRows, int mCols) {
        int[] ans = new int[nRows * mCols];
        int i = 0;

        for (int cols = 0; cols < mCols; cols++) {
            if (cols % 2 == 0) {
                //top to bottom
                for (int rows = 0; rows < nRows; rows++) {
                    ans[i] = arr[rows][cols];
                    i++;
                }
            } else {
                //bottom to top
                for (int rows = nRows - 1; rows >= 0; rows--) {
                    ans[i] = arr[rows][cols];
                    i++;
                }
            }
        }
        return ans;
    }
}
