package BinarySearchQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(findDistance(arr, n, m));
    }

    private static int findDistance(int[] arr, int n, int cows) {
        int low = 1, high = arr[n - 1] - arr[0];
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, n, cows, mid)) {
                ans = mid;
                low = mid + 1; //maximize distance
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int n, int cows, int mid) {
        int countCows = 1;
        int position = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - position >= mid) {
                //we can place our cow
                countCows++;
                position = arr[i];
            }
        }
        return countCows >= cows;
    }
}
