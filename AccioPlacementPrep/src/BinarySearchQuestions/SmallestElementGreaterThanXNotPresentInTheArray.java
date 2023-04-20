package BinarySearchQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElementGreaterThanXNotPresentInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(nextGreatestLetter(arr, target));
    }

    public static int nextGreatestLetter(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0, high = n - 1, ans = target + 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // If element at mid is less than or equal to searching element
            if (arr[mid] == ans) {

                // Increment searching element
                ans++;

                // Make high as N - 1
                high = n - 1;
            } else if (arr[mid] < ans) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Return the next greater element
        return ans;
    }
}
