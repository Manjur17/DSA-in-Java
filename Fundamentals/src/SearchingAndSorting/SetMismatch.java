package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SetMismatch {
    public static int[] takeInput() {
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
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i] != nums[correctIndex]) {
                getSwap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        //for searching the missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        int[] ans =findErrorNums(arr);
        System.out.println(Arrays.toString(ans));

    }
}
