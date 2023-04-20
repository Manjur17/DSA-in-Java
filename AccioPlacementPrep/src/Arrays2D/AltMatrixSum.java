package Arrays2D;

import java.util.Scanner;

public class AltMatrixSum {
    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] input = new int[n][n];
        //Taking input from user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        int n = arr[0].length;
        int sumBlack = 0, sumWhite = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    sumBlack += arr[i][j];
                } else {
                    sumWhite += arr[i][j];
                }
            }
        }
        System.out.println(sumBlack);
        System.out.println(sumWhite);
    }
}
