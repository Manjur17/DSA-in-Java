package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main() {
        int[] arr = arrayFunction();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer to be searched in the given array/list:");
        int x = s.nextInt();
        int ans = binarySearch(arr,x);
    }

    private static int binarySearch(int[] nums,int target) {
        if (target > nums[nums.length-1]){
            return -1;
        }
        //return index of the greatest number greater than or equal to target element
        int startIndex = 0, endIndex = nums.length - 1;
        boolean isAsc = nums[startIndex] < nums[endIndex];
        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < nums[mid]) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }
}

