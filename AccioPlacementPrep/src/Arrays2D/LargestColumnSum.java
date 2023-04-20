package Arrays2D;

import java.util.Scanner;

public class LargestColumnSum {
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
        largestColumnSum(arr);
    }

    private static void largestColumnSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
                largest = Math.max(largest, colSum);
            }
        }
        System.out.println(largest);
    }
}
