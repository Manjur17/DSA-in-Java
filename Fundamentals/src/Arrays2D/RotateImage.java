package Arrays2D;

import java.util.Scanner;

public class RotateImage {
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
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void rotateImage(int[][] arr) {
        //transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //now reverse the rows
        for (int i = 0; i < arr.length; i++) {
            int leftIndex = 0, rightIndex = arr[leftIndex].length - 1;
            while (leftIndex < rightIndex){
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        printInput(arr);
    }

    public static void printInput(int[][] input) {
        int rows = input.length;
        int columns = input[0].length;
        //Printing the 2-D Array
        for (int[] ints : input) {
            for (int j : ints) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        rotateImage(arr);
    }
}
