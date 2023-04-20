package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr, n));
    }

    static int missingNumber(int[] arr, int n) {
        for (int i = 0; i < n; i++) {

            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            if (j + 1 != arr[j])
                return j + 1;
        }

        return n + 1;
    }
}
