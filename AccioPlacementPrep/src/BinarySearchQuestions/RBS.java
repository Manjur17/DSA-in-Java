package BinarySearchQuestions;

import java.util.Scanner;

public class RBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(arr, target));
        System.out.println(searchRecursionTechnique(arr, target));
    }

    static int searchRecursionTechnique(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;

            if (arr[low] <= arr[mid]) { // left part is sorted
                if (arr[low] <= target && arr[mid] >= target)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else { // right part is sorted
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1;

        int pivot = findMin(nums, l, h); //minIndex

        if (nums[pivot] == target)
            return pivot;

        if (pivot > 0 && target >= nums[0] && target <= nums[pivot - 1])
            return binarySearch(nums, 0, pivot - 1, target);
        else
            return binarySearch(nums, pivot + 1, n - 1, target);

    }

    static int binarySearch(int[] arr, int low, int high, int key) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) return mid;
            else if (key < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    static int findMin(int[] arr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
