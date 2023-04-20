package BinarySearchQuestions;

import java.util.*;

public class MinRemovals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minRemovals(arr, n, k));
    }

    public static int minRemovals(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = n; //maximum removals
        for (int i = 0; i < n; i++) {
            int low = i + 1, high = n - 1;
            int j = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] - arr[i] <= k) {
                    j = mid;
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
            if (j != -1) {
                ans = Math.min(ans, n - (j - i + 1));
            }
        }
        //if (ans == n), return n - 1 bcz we need to have at-least 1 elements
        //bcz that only element is max and min which satisfies max - min = 0;
        return (ans == n) ? n - 1 : ans;
    }

    static int removals(int[] arr, int n, int k) {
        // code here
        int answer = n;

        // Sort the array in increasing order
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] - arr[i] <= k) {
                    //sub array size = (j - i + 1)
                    //maximize the size so that removal is less
                    //no of removed elements = n - sub array size
                    answer = Math.min(answer, n - (j - i + 1));
                }

            }

        }
        return answer;
    }

}
