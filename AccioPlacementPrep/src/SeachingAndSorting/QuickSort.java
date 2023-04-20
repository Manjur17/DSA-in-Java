package SeachingAndSorting;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivot = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, pivot - 1);
            quickSort(arr, pivot + 1, endIndex);
        }

    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i <= end && arr[i] <= pivot) {
                i++;
            }
            while (j >= 0 && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //put pivot element at correct position -> SWAP(pivot,arr[j])
        arr[start] = arr[j];
        arr[j] = pivot;
        return j; //pivot index
    }
}
