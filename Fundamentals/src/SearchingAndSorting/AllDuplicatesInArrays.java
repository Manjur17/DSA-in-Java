package SearchingAndSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDuplicatesInArrays {
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

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        cyclicSort12N(nums);
        //for searching the missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                list.add(nums[j]);
            }
        }
        return list;
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
        cyclicSort12N(arr);
        List<Integer> list = new ArrayList<>();
        list = findDuplicates(arr);
        System.out.println(list);
    }
}
