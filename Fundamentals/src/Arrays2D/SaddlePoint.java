package Arrays2D;

import java.util.Scanner;

public class SaddlePoint {
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

    public static void saddlePoint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallValue = 0;
            for (int j = i; j < arr[0].length; j++) {
                if (arr[i][smallValue] > arr[i][j]) {
                    smallValue = j;
                }
            }
            boolean isLarger = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][smallValue] > arr[i][smallValue]) {
                    isLarger = false;
                    break;
                }
            }
            if (isLarger) {
                System.out.println("The saddle point is: " + arr[i][smallValue]);
                return;
            }
        }
        System.out.println("No saddle point found!!!");
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        saddlePoint(arr);
    }
}
