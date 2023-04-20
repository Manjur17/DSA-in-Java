package QueuesAndDeques;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] ans = maxSlidingWindow(arr1, k);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[n - k + 1];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && (i - dq.peek()) == k) {
                dq.pollFirst();
            }
            //we want to maintain deque in increasing way
            while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);

            if (i >= k - 1 && !dq.isEmpty()) {
                ans[j++] = arr[dq.peekFirst()];
            }
        }
        return ans;
    }
}
