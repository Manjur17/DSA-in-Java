package Arrays2D;

import java.util.Scanner;

public class DiagonalTraversal {
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
        }
        return input;
    }
    public static void printMatrix(int[][] arr){
        int rows = arr.length;
        int column = arr[0].length;
        int count = 0;
        int num = rows * column;
        //Approach 1
        while (count < column){
            for (int i =0; i < rows; i++){
                for (int j = 0; j < column;j++){
                    if (j - i == count)
                        System.out.print(arr[i][j] + " ");
                }
            }
            count++;
        }
        System.out.println();
        //Approach 2
        for (int gap = 0; gap < arr.length;gap++){
            for (int i = 0,j = gap; j < column; i++, j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = takeInput();
        printMatrix(arr);
    }
}
