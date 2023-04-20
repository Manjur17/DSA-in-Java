package BinarySearchQuestions;

import java.util.Scanner;

public class MinimumLimitOfBallsInABag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumSize(arr, k));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = nums[0];
        for (int val : nums) {
            if (val > high) {
                high = val;
            }
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, maxOperations)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int penalty, int maxOperations) {
        int ops = 0;
        for (int num : arr) {
            ops += (num - 1) / penalty;
        }
        return ops <= maxOperations;
    }

    private static boolean isPossibleAlternative(int[] arr, int penalty, int maxOperations) {
        int totOps = 0;
        for (int num : arr) {

            // check if remainder is 0 then possible operations will be (i/mid - 1) because:
            // if we divide 12 in 4 parts of 3 each then we will cut the 12 three times 3 - 3 - 3 and
            // last part will be 3. so total operations will be 3...

            if (num % penalty == 0) {
                totOps += (num / penalty - 1);
            }

            // if the value is not the multiple of mid then remainder will be extra and kept in a new bag
            // that's why we will not delete 1.
            else {
                totOps += num / penalty;
            }
        }
        return totOps <= maxOperations;
    }
}
