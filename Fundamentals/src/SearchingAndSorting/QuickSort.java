package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
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

    public static int arrayPartition(int[] arr, int sI, int eI) {
        int pivot = arr[sI];
        int count = 0;
        for (int i = sI + 1; i <= eI; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        //putting pivot at its correct position
        int pivotIndex = sI + count;
        arr[sI] = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        int i = sI, j = eI;
        while (i < j) {
            while (i <= eI && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int sI, int eI) {
        if (sI >= eI) {
            return;
        }
        int partitionIndex = arrayPartition(arr, sI, eI);
        quickSort(arr, sI, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, eI);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
