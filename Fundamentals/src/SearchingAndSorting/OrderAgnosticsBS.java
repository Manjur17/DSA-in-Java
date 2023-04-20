package SearchingAndSorting;

import java.util.Scanner;

public class OrderAgnosticsBS {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int orderAgnosticsBS(int[] arr, int target) {
        int startIndex = 0, endIndex = arr.length - 1;
        boolean isAsc = arr[startIndex] < arr[endIndex];
        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = takeInput();
        int target = s.nextInt();
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans);
    }
}
