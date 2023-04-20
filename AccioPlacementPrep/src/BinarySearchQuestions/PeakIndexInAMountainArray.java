package BinarySearchQuestions;

import java.util.Scanner;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray2(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                return mid;
            else if (arr[mid] < arr[mid + 1])
                low = mid + 1;
            else if (arr[mid] < arr[mid - 1])
                high = mid - 1;
        }
        return -1;
    }

    public static int peakIndexInMountainArray2(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1])
                high = mid; //possible answer
            else
                low = mid + 1; // increasing part so low need not be taken into answer
        }
        return low;
    }
}
