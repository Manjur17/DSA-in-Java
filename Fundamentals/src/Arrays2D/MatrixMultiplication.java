package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns");
        int columns = s.nextInt();
        int[][] input = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element at " + i + " th row and" + j + " th columns:");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static int[][] matrixMultiplication(int[][] arr1, int[][] arr2) {
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        if (c1 != r2) {
            return new int[][]{{-1, -1}};
        }
        int r3 = arr1.length;
        int c3 = arr2[0].length;
        int[][] prd = new int[r3][c3];
        for (int i = 0; i < r3; i++) {
            for (int j = 0; j < c3; j++) {
                for (int k = 0; k < c1; k++) {
                    prd[i][j] += arr1[i][k] + arr2[k][j];
                }
            }
        }
        return prd;
    }

    public static void main(String[] args) {
        int[][] arr1 = takeInput();
        int[][] arr2 = takeInput();
        int[][] ans = matrixMultiplication(arr1,arr2);
        for (int[] innArr: ans){
            for (int an:innArr) {
                System.out.print(an + " ");
            }
            System.out.println();
        }
    }
}
