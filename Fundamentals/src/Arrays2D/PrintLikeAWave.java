package Arrays2D;

import java.util.Scanner;

public class PrintLikeAWave {
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

    //Approach 1
    public static void printLikeAWave(int[][] arr) {
        if (arr.length == 0) {
            return;
        }
        int startCol = 0;
        for (int i = 0; i < arr[0].length; i += 2) {
            int startRow = 0;
            while (startRow < arr.length) {
                System.out.print(arr[startRow][startCol] + " ");
                startRow++;
            }
            startCol++;
            if (startCol < arr[0].length) {
                while (startRow > 0) {
                    System.out.print(arr[startRow - 1][startCol] + " ");
                    startRow--;
                }
                if (startCol < arr[0].length - 1) {
                    startCol++;
                }
            }
        }
    }

    //Approach 2
    public static void printLikeAWave2(int[][] arr) {
        int rows = arr.length;
        if (rows == 0) {
            return;
        }
        int cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void resultArr(int t) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= t; i++) {
            int[][] arr = takeInput();
            printLikeAWave(arr);
            System.out.println();
            printLikeAWave(arr);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t = s.nextInt();
        resultArr(t);
    }
}
