package Arrays;

import java.util.Scanner;

public class FacingTheSun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countBuildings(arr, n));
    }

    static int countBuildings(int[] h, int n) {
        // code here
        int currMax = h[0], count = 1;
        for (int i = 1; i < n; ++i) {
            if (h[i] > currMax) {
                currMax = h[i];
                count++;
            }
        }

        return count;
    }
}
