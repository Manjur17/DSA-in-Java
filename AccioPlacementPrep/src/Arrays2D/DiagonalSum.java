package Arrays2D;

import java.util.Scanner;

public class DiagonalSum {
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
        int first = calculateF(arr, n, 0, 0);
        int second = calculateS(arr, n, 0, n - 1);
        int total = first + second;
        if(n % 2 != 0) total -= arr[n/2][n/2];
        System.out.print(total);
    }

    public static int calculateF(int[][] arr, int n, int i, int j) {
        int sum = 0;
        while (i < n && j < n) {
            sum += arr[i][j];
            i++;
            j++;
        }
        return sum;
    }

    public static int calculateS(int[][] arr, int n, int i, int j) {
        int sum = 0;
        while (i < n && j >= 0) {
            sum += arr[i][j];

            i++;
            j--;
        }
        return sum;
    }
}
