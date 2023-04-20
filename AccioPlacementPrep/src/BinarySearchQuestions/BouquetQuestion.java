package BinarySearchQuestions;

import java.util.Scanner;

public class BouquetQuestion {
    //    Minimum Number of Days to Make m Bouquets
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minDays(arr, m, k));
    }

    //TC - O(n log m)
    //n is the length of array and m is the length of search space-> max_element
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (m * k > n) return -1;
        int low = 1; //min days
        int high = (int) 1e9; //max days from Constraints
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, m, k, mid, n)) {
                ans = mid; //one possible answer
                high = mid - 1;// now check on the left range if we can form m bouquets in lesser day
            } else {
                //search in the right range
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] bloomDay, int m, int k, int mid, int n) {
        int flowers = 0, bouquets = 0;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= mid) flowers++;
            else flowers = 0; //no adjacent flower found

            if (flowers >= k) {
                bouquets++;
                flowers = 0; // check for other bouquet if possible using k adjacent flowers
            }
        }
        return bouquets >= m;
    }
}
