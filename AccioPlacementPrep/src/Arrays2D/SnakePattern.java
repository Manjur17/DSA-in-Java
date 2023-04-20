package Arrays2D;

import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];
        //Taking input from user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        printSnake(arr,n);
    }

    private static void printSnake(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 ==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else {
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

}
