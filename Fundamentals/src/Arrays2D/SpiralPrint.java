package Arrays2D;

import java.util.Scanner;

public class SpiralPrint {
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
                System.out.println("Enter the element at " + i + " th row and" + j +" th columns:");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void printSpiral1(int[][] arr){
        int count = 0;int rows = arr.length;
        if (rows == 0){
            return;
        }
        int cols = arr[0].length;
        int num = (rows * cols);
        int minRow = 0, maxRow = rows - 1;
        int minCol = 0, maxCol = cols - 1;
        while (count < num){
            //Printing the Left Wall(Min column)
            for(int i = minRow; count < num && i <= maxRow;i++){
                System.out.print(arr[i][minCol] + " ");
                count++;
            }
            minCol++;

            //Printing the Bottom Wall(Max row)
            for (int i = minCol; count < num && i  <= maxCol;i++){
                System.out.print(arr[maxRow][i] + " ");
                count++;
            }
            maxRow--;

            //Printing the Right Wall(Max column)
            for (int i = maxRow; count < num && i >= minRow ;i--){
                System.out.print(arr[i][maxCol] + " ");
                count++;
            }
            maxCol--;

            //Printing the Top Wall(Min Row)
            for (int i = maxCol; count < num && i >= minCol; i--){
                System.out.print(arr[minRow][i] + " ");
                count++;
            }
            minRow++;
        }
    }
    public static void resultArr(int t){
        Scanner s=new Scanner(System.in);
        for (int i=1; i <= t; i++) {
            int[][] arr = takeInput();
            printSpiral1(arr);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultArr(t);
    }
}
