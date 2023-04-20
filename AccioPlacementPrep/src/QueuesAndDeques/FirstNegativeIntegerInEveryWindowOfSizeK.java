package QueuesAndDeques;

import java.util.*;

public class FirstNegativeIntegerInEveryWindowOfSizeK {
    static void printFirstNegativeInteger(int[] arr, int k, int n) {
        int firstNegativeIndex = 0;
        int firstNegativeElement;

        for (int i = k - 1; i < n; i++) {

            // Skip out of window and positive elements
            while ((firstNegativeIndex < i) && (firstNegativeIndex <= i - k || arr[firstNegativeIndex] >= 0)) {
                firstNegativeIndex++;
            }

            // Check if a negative element is found, otherwise use 0
            if (arr[firstNegativeIndex] < 0) {
                firstNegativeElement = arr[firstNegativeIndex];
            } else {
                firstNegativeElement = 0;
            }
            System.out.print(firstNegativeElement + " ");
        }
    }

    public long[] printFirstNegativeIntegerQ(long[] a, int n, int k) {
        long[] ans = new long[n - k + 1];
        int j = 0;
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            //first pop out of window element
            if (!q.isEmpty() && (i - q.peek()) == k) {
                q.poll();
            }

            //then push current element
            if (a[i] < 0)
                q.add(i);

            // put in ans
            if(i >= k-1)
                ans[j++] = q.isEmpty() ? 0 : a[q.peek()];
        }


        return ans;
    }

    public long[] printFirstNegativeInteger(long[] a, int n, int k) {
        long[] ans = new long[n - k + 1];
        int j = 0;
        Queue<Integer> q = new LinkedList<>();
        //process first window
        for (int i = 0; i < k; i++) {
            if (a[i] < 0) {
                q.add(i);
            }
        }
        //push ans for FIRST window
        ans[j++] = q.isEmpty() ? 0 : a[q.peek()];
        //now process for remaining windows
        for (int i = k; i < n; i++) {
            //first pop out of window element
            if (!q.isEmpty() && (i - q.peek()) == k) {
                q.poll();
            }

            //then push current element
            if (a[i] < 0)
                q.add(i);

            // put in ans
            ans[j++] = q.isEmpty() ? 0 : a[q.peek()];
        }


        return ans;
    }
}
