package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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

    public static void insertionSort(int[] arr) {
        //its runs and sorts the array in N-2 round
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    getSwap(arr, j);
                } else {
                    break;
                }
            }
        }
        print(arr);
    }

    public static void getSwap(int[] arr, int j) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] input) {
        int size = input.length;
        System.out.println("The elements of arrays are:");
        System.out.println(Arrays.toString(input));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        insertionSort(arr);
    }
}
