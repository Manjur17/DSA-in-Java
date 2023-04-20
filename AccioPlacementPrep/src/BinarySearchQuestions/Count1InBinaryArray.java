package BinarySearchQuestions;

import java.util.Scanner;

public class Count1InBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(count(arr));
    }

    private static int count(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) {
                ans = n - mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
