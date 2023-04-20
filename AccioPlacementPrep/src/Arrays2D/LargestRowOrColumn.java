package Arrays2D;

import java.util.Scanner;

public class LargestRowOrColumn {
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
        largestRowOrColumnSum(arr);
    }

    private static void largestRowOrColumnSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        boolean isRow = true;
        int largest = Integer.MIN_VALUE;
        int num = 0;

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > largest) {
                largest = rowSum;
                num = i;
            }
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            if (colSum > largest) {
                largest = colSum;
                isRow = false;
                num = j;
            }
        }
        if (isRow) {
            System.out.println("Row " + num + " " + largest);
        } else {
            System.out.println("Column " + num + " " + largest);
        }
    }
}
