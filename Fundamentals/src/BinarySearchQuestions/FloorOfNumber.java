package BinarySearchQuestions;

import java.util.Scanner;

public class FloorOfNumber {
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

    public static int ceilingFunction(int[] arr, int target) {
        //if the target is smaller than the smallest element in the array
        if (target < arr[0]){
            return -1;
        }
        //return index of the greatest number smaller than or equal to target element
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
        return endIndex;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = takeInput();
        int target = s.nextInt();
        int ans = ceilingFunction(arr, target);
        System.out.println(ans);
    }
}
