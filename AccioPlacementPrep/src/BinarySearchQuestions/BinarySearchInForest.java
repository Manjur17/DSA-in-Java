package BinarySearchQuestions;

import java.util.*;

public class BinarySearchInForest {
    public static void main(String[] args) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find_height(arr, n, k));
    }

    static int find_height(int[] tree, int n, int k) {
        int low = 1;
        int high = (int) 1e6;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int m = isPossible(tree, mid, k);
            if (m <= k) {
                ans =  mid;
                high = mid -1;
            } else {
                // m > threshold
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int isPossible(int[] tree, int mid, int k) {
        int sum = 0;
        for (int x: tree){
            if (x > mid){
                sum += (x-mid);
            }
        }
        return sum;
    }
}
