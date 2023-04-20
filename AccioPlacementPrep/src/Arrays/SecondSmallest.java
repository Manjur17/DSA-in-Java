package Arrays;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = find(arr, n);
    }

    public static int[] find(int[] arr, long n) {
        int smallest = arr[0], secondsmallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        if (secondsmallest == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        return new int[]{smallest, secondsmallest};
    }
}
