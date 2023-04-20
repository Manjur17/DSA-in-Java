package BinarySearchQuestions;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findPeakElement(arr));
        System.out.println(peakIndex(arr));
    }

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0, end = n - 1;
        while (low <= end) {
            int mid = low + (end - low) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) {
                return mid; // peak element
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                //we are in the decreasing slope so search in the left
                end = mid - 1;
            } else {
                low = mid + 1; //we are in the increasing slope so search in the right
            }
        }
        return -1;

        /* -> Brute force
        int peak = -1;
        if (arr[0] > arr[1]){
            return 0;
        }
        for (int i = 1; i < (n-1); i++) {
            if (arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                peak = i;
                break;
            }
        }
        if (arr[n-1] > arr[n-2] && peak == -1){
            peak = n-1;
        }
        */
    }

    public static int peakIndex(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1])
                high = mid; //possible answer as we may still be in the decreasing part
            else if (arr[mid] < arr[mid + 1]) //this condition is optional
                low = mid + 1; // increasing part so low need not be taken into answer
        }
        return low;
    }
}
