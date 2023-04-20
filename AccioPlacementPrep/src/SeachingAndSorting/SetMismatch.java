package SeachingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        cyclicSort(nums, nums.length);
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                arr[0] = arr[i];
                arr[1] = i + 1;
            }
        }
        return arr;
    }

    public static void cyclicSort(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
