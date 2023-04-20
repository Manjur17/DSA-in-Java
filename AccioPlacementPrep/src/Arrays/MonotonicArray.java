package Arrays;

import java.util.Scanner;

public class MonotonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isMonotonic(arr));
    }

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                decreasing = false; // this in actually increasing array
            if (nums[i] < nums[i - 1])
                increasing = false; // this in actually decreasing array
        }
        return increasing || decreasing;
    }
}
