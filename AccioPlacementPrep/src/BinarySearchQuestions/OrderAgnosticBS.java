package BinarySearchQuestions;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int[] nums = {20, 18, 15, 9, 7, 6, 2, 1};
        System.out.println(search(arr, 9));
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target) {
        int sI = 0, eI = nums.length - 1;

        boolean isAscending = nums[sI] < nums[eI];

        while (sI <= eI) {
            int mid = sI + (eI - sI) / 2;

            if (target == nums[mid]) return mid;
            if (isAscending) {
                if (target < nums[mid]) {
                    eI = mid - 1;
                } else {
                    sI = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    eI = mid - 1;
                } else {
                    sI = mid + 1;
                }
            }
        }
        return -1;
    }
}
