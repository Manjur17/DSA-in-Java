package QueuesAndDeques;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SumOfMinMaxOfKWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(sumMaxMin(arr1, k));
    }

    public static int sumMaxMin(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> dqMax = new ArrayDeque<>();
        Deque<Integer> dqMin = new ArrayDeque<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!dqMax.isEmpty() && (i - dqMax.peek()) == k) {
                dqMax.pollFirst();
            }
            if (!dqMin.isEmpty() && (i - dqMin.peek()) == k) {
                dqMin.pollFirst();
            }
            while (!dqMax.isEmpty() && arr[i] > arr[dqMax.peekLast()]) {
                dqMax.pollLast();
            }
            while (!dqMin.isEmpty() && arr[i] < arr[dqMin.peekLast()]) {
                dqMin.pollLast();
            }
            dqMax.addLast(i);
            dqMin.addLast(i);
            if (i >= k - 1 && !dqMax.isEmpty() && !dqMin.isEmpty()) {
                ans += arr[dqMax.peekFirst()] + arr[dqMin.peekFirst()];
            }
        }
        return ans;
    }
}
