package Recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 34, 56, 78, 99};
        int target = sc.nextInt();
        System.out.println(search(arr, 0, arr.length - 1, target));
    }

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
