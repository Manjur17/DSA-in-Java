package SearchingAndSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateElement {
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
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    getSwap(arr, i , correct);
                } else {
                    //index at correct position is the duplicate index
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    public static int findDuplicate1(int[] nums) {
        cyclicSort12N(nums);

        //for searching the missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return nums[j];
            }
        }
        return -1;
    }

    private static void cyclicSort12N(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                getSwap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int ans = findDuplicate(arr);
        System.out.println(ans);
        System.out.println(findDuplicate1(arr));
    }
}
