package BinarySearchQuestions;

import java.util.Scanner;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNonDuplicateEfficient(arr));
    }

    public int singleNonDuplicate(int[] nums) {
        //Brute force -> we can also use XOR properties
        int n = nums.length;
        int ans = nums[0];
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                ans = nums[i];
            }
        }
        if (n > 1 && nums[n - 1] != nums[n - 2]) {
            ans = nums[n - 1];
        }
        return ans;
    }

    public static int singleNonDuplicateEfficient(int[] nums) {
        int low = 0, high = nums.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == nums[mid ^ 1])
                low = mid + 1; //Shrinking the left half
            else
                high = mid - 1; //Shrinking the right half

        }

        return nums[low];
    }

    public int singleNonDuplicate2(int[] nums) {
        int low = 0, high = nums.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 0) {
                //Checking whether we are in right half
                if (nums[mid] != nums[mid + 1])
                    high = mid - 1; //Shrinking the right half
                else
                    low = mid + 1; //Shrinking the left half
            } else {
                //Checking whether we are in left half
                if (nums[mid] != nums[mid + 1])
                    low = mid + 1; //Shrinking the left half
                else
                    high = mid - 1; //Shrinking the right half
            }
        }
        return nums[low];
    }


}
