package SeachingAndSorting;

import java.util.*;

public class MinimumSubsequence {
    //obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non-included elements in such subsequence.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minSubsequence(arr));
    }

    public static List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        if (n == 1) {
            list.add(nums[0]);
            return list;
        }

        int sum1 = 0, sum2 = 0;
        for (int num : nums) {
            sum1 += num;
        }

        for (int i = n - 1; i >= 0; i--) {
            sum2 += nums[i];
            list.add(nums[i]);
            sum1 -= nums[i];
            if (sum2 > sum1) {
                break;
            }
        }
        return list;
    }
}
