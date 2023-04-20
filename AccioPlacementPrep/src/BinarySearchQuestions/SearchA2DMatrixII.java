package BinarySearchQuestions;

import java.util.Arrays;

public class SearchA2DMatrixII {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {45, 55, 65, 75},
                {78, 79, 87, 89},
                {93, 95, 98, 99}
        };
        System.out.println(Arrays.toString(searchMatrix(arr, 87)));
        System.out.println(Arrays.toString(searchMatrixSame(arr, 87)));
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = (m * n) - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (matrix[mid / n][mid % n] == target) {
                return new int[]{mid / n, mid % n};
            }
            if (matrix[mid / n][mid % n] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] searchMatrixSame(int[][] matrix, int target) {
        int row = 0, cols = matrix[0].length - 1;
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
