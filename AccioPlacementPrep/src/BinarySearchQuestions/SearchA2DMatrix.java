package BinarySearchQuestions;

import java.util.Arrays;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 59}
        };
        System.out.println(Arrays.toString(searchMatrix(arr, 37)));
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        int row = 0, cols = matrix.length - 1;
        while (row < matrix.length && cols >= 0) {
            if (matrix[row][cols] == target) {
                return new int[]{row, cols};
            }
            if (matrix[row][cols] < target) {
                row++;
            } else {
                cols--;
            }
        }
        return new int[]{-1, -1};
    }
}
