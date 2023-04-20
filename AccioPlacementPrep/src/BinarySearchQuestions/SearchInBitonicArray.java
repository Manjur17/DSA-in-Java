package BinarySearchQuestions;

import java.util.Scanner;

public class SearchInBitonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findInMountainArray(target, arr));
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray2(mountainArr);
        int first = binarySearch(mountainArr, target, 0, peak);
        if (first != -1) return first;
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    public static int peakIndexInMountainArray2(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1])
                high = mid; //possible answer
            else if (arr[mid] < arr[mid + 1])
                low = mid + 1; // increasing part so low need not be taken into answer
        }
        return low;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        boolean isAscending = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) return mid;
            if (isAscending) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
