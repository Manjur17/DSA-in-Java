package BinarySearchQuestions;

import java.util.Scanner;

public class KokoEatingBananas {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minEatingSpeed(arr, k));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = (int) 1e9;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int m = isPossible(piles, mid);
            if (m <= h) {
                ans = mid;
                high = mid - 1;
            } else  {
                //m > h
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int isPossible(int[] piles, int speed) {
        int totalTime = 0;
        for (int x : piles) {
            totalTime +=  Math.ceil((double) x / speed);
        }

        return totalTime;
    }
}
