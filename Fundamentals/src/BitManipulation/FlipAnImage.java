package BitManipulation;

import java.util.Scanner;

public class FlipAnImage {
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

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] rows: image){
            for (int i =0;i < (image[0].length+1)/2;i++){
                int temp = rows[i] ^ 1;
                rows[i] = rows[image[0].length - i - 1] ^ 1;
                rows[image[0].length - i - 1] = temp;
            }
        }
        return image;
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
        int[][] ans = flipAndInvertImage(arr);
        printInput(ans);
    }
}
