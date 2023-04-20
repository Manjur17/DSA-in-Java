package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class BooleanMatrix {
    public static void printInput(int[][] input) {
        //Printing the 2-D Array
        for (int[] ints : input) {
            for (int j : ints) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];
        int[] row = new int[m];
        //Taking input from user
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
                if (arr[i][j] == 1) {
                    row[i] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {

            if (row[i] == 1) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 1;
                }
            }

        }
        printInput(arr);
    }


}
