package Arrays2D;

import java.util.Scanner;

public class CarPolling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][3];
        //Taking input from user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int k = s.nextInt();
        System.out.println(carPooling(arr,k));
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];

        for (int[] trip : trips) {
            arr[trip[1]] += trip[0];
            arr[trip[2]] -= trip[0];
        }

        for (int val : arr) {
            capacity -= val;
            if (capacity < 0)
                return false;
        }

        return true;
    }
}
