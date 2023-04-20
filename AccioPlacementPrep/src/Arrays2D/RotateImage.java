package Arrays2D;

import java.util.List;
import java.util.Scanner;

public class RotateImage {
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
        rotate(arr);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        rotateby90(arr, arr.length);
    }

    public static void rotate(int[][] matrix) {
        //transpose the matrix -> valid only for square matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                //traverse only in the upper triangle and arr[i][j] = arr[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //now reverse the rows
        for (int i = 0; i < matrix.length; i++) {
            int leftIndex = 0, rightIndex = matrix[leftIndex].length - 1;

            while (leftIndex < rightIndex) {
                int temp = matrix[i][leftIndex];
                matrix[i][leftIndex] = matrix[i][rightIndex];
                matrix[i][rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
    }

    static void rotateby90(int[][] matrix, int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                //traverse only in the upper triangle and arr[i][j] = arr[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //anticlockwise
        for (int i = 0; i < n; i++) {
            int topIndex = 0, bottomIndex = matrix.length - 1;

            while (topIndex < bottomIndex) {
                int temp = matrix[topIndex][i];
                matrix[topIndex][i] = matrix[bottomIndex][i];
                matrix[bottomIndex][i] = temp;
                topIndex++;
                bottomIndex--;
            }
        }
    }
}
