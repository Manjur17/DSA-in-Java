package SeachingAndSorting;

import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthSmallest(arr, 0, n - 1, k));
    }

    public static int kthSmallest(int[] arr, int low, int high, int k) {
        while (low <= high) {
            int pivot = partition(arr, low, high);
            if (pivot == k - 1)
                return arr[pivot];
            else if (pivot > k - 1)
                high = pivot - 1;
            else
                low = pivot + 1;
        }
        return -1;
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i <= end && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }
}
