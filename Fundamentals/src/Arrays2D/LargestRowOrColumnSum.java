package Arrays2D;

import java.util.Scanner;

public class LargestRowOrColumnSum {
    public static int[][] takeInput(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns");
        int columns = s.nextInt();
        int [][] input = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++){
            for (int j = 0;j < columns;j++){
                System.out.println("Enter the element at " + i + " th row and " + j +" th columns:");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }
    public static void  printMaxSum(int[][] input){
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;
        int num = 0;
        int rows = input.length;
        if (rows == 0){
            System.out.println("Row" + num + " " + largestSum);
            return;
        }
        int columns = input[0].length;
        //Finding Max sum in Rows
        for (int i = 0; i < rows; i++){
            int rowSum = 0;
            for (int j = 0; j < columns;j++){
                rowSum += input[i][j] ;
            }
            if (rowSum > largestSum) {
                largestSum = rowSum;
                num = i;
            }
        }
        //Finding Max sum in columns
        for (int j = 0; j < columns;j++){
            int colSum = 0;
            for (int i = 0; i < rows;i++){
                colSum += input[i][j] ;
            }
            if (colSum > largestSum) {
                largestSum = colSum;
                num = j;
                isRow = false;
            }
        }
        if (isRow){
            System.out.println("Row " + num + " " + largestSum);
        }else {
            System.out.println("Column " + num + " " + largestSum);
        }
        System.out.println();
    }
    public static void resultArr(int t){
        Scanner s=new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[][] arr = takeInput();
            printMaxSum(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
