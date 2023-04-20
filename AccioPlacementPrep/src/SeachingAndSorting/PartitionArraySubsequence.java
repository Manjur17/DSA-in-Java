package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionArraySubsequence {
    //Partition Array Such That Maximum Difference Is K
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(partitionArray(arr, k));
    }

    public static int partitionArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums); //greedy approach
        int count = 1;//-> at least 1 piece
        int minVal = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] - minVal > k) {
                count++;
                minVal = nums[i];
            }
        }
        return count;
    }
}
