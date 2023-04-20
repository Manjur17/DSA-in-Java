package Arrays2D;

import java.util.Scanner;

public class TotalSumOnBoundariesAndDiagonals {
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

    public static void printSum(int[][] arr) {
        int rows = arr.length;
        int column = arr[0].length;
        int boSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == column - 1 || i == j || (i + j) == rows - 1 ) {
                    boSum += arr[i][j];
                }
            }
        }
        System.out.println("The boundary Sum is: " + boSum);

    }
    public static void resultArr(int t){
        Scanner s=new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[][] arr = takeInput();
            printSum(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}