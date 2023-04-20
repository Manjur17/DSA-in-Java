package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicateElement {
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

    public static void duplicateElements(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < (size - 1); i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The duplicate element inside array is: " + arr[i]);
                    break;
                }
            }
        }
    }

    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Traverse through the array.
        for(int i = 0; i < n; i++) {

            // Use array indices to store visited state of each element.
            int index = Math.abs(arr.get(i)) - 1;

            // Mark as visited by multiplying with '-1'.
            arr.set(index, arr.get(index) * -1);

            // In case of duplicate, this will become +ve.
            if(arr.get(index) > 0){

                // Return duplicate element.
                return Math.abs(arr.get(i));
            }
        }

        return -1;
    }

    public static void resultArr(int t) {
        for (int i = 1; i <= t; i++) {
            int[] arr = arrayFunction();
            duplicateElements(arr);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t = s.nextInt();
        resultArr(t);
    }
}
