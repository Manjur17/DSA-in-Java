package BinarySearchQuestions;

import java.util.Scanner;

public class PositionInInfiniteArray {
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

    public static int searchIndex(int[] arr, int target) {
        int ans = -1;
        int start = 0, end = 1;
        if (target > arr[end]) {
            //Double the window
            int newStartIndex = end + 1;
            end = (end - start + 1) * 2 + end;
            start = newStartIndex;
        }
        ans = binarySearch(arr, target, start, end);
        return ans;
    }

    public static int binarySearch(int[] arr, int target, int startIndex, int endIndex) {
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
        int ans = searchIndex(arr, target);
        System.out.println(ans);
    }
}
