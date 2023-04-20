package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DBasics {
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
        printInput(arr);
    }
}
