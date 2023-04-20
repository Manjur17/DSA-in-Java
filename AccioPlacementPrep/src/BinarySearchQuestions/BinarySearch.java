package BinarySearchQuestions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(arr, 9));
        System.out.println(search(arr, 0, arr.length, 9));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    //Using Recursion
    private static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, start, mid - 1, target);
        }
        return search(arr, mid + 1, end, target);
    }
}
