package TimeComplexity;

import java.util.Scanner;

public class PivotIndex {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int pivotIndex(int[] arr) {
        if (arr.length <= 1) {
            return arr[0];
        }
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;  //we can return arr[high] as end = high
    }

    public static void main(String[] args) {
        int[] arr = arrayFunction();
        System.out.println(pivotIndex(arr));
    }
}
