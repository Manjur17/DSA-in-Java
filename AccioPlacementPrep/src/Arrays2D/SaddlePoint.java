package Arrays2D;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] arr = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        findSaddle(arr);
    }

    private static void findSaddle(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the least in the row
            int saddle = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i][j] < arr[i][saddle]) {
                    saddle = j;
                }
            }
            //now check for the max in that row
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][saddle] > arr[i][saddle]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(saddle);
                return;
            }
        }
        System.out.print("No saddle point found");
    }
}
