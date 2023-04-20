package Arrays;

import java.util.Scanner;

public class CountHillsAndValleysInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countHillValley(arr));
    }

    public static int countHillValley(int[] nums) {
        int count = 0;
        int i = 1;
        int n = nums.length;
        while (i < n - 1) {
            int j = i + 1;
            while (j < n && nums[i] == nums[j]) {
                j++;
            }
            if (j < n && (nums[i] > nums[i - 1] && nums[i] > nums[j])) {
                count++; //this is a hill
            } else if (j < n && (nums[i] < nums[i - 1] && nums[i] < nums[j])) {
                count++; //this is a valley
            }
            i = j;
        }

        return count;
    }
}
