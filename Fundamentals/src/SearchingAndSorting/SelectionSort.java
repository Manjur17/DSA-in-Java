package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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

    public static void selectionSort2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //find the maximum in every round and place it at its correct position from ending
            int last = arr.length - i - 1;
            int maxIndex = 0;
            for (int j = 0; j <= last; j++) {
                //finding the maximum index
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            getSwap(arr, maxIndex, last);
        }
        print(arr);
    }

    public static void selectionSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the minimum in every round and place it at its correct position from starting
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //finding the minimum index
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            getSwap(arr, i, minIndex);
        }
        print(arr);
    }

    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void print(int[] input) {
        int size = input.length;
        System.out.println("The elements of arrays are:");
        System.out.println(Arrays.toString(input));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        selectionSort1(arr);
        selectionSort2(arr);
    }

}
