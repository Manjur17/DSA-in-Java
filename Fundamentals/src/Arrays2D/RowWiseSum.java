package Arrays2D;

import java.util.Scanner;

public class RowWiseSum {
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
                input[i][j] = s.nextInt();
            }
            System.out.println();
        }
        return input;
    }
    public static void printRowWiseSum(int[][] input){
        int rows = input.length;
        if (rows == 0){
            return;
        }
        int columns = input[0].length;
        for (int i = 0; i < rows; i++){
            int sum = 0;
            for (int j = 0;j < columns;j++){
                sum += input[i][j] ;
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void resultArr(int t){
        Scanner s=new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[][] arr = takeInput();
            printRowWiseSum(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
