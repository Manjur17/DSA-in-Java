package Heaps;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;
        //Build the heap
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
        //remove element from starting 1 by 1 and put them at its respective last position
        for (int i = n - 1; i >= 0; i--) {
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        int parentIndex = i;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while (leftChildIndex < n) {
            int maxIndex = parentIndex;
            if (arr[leftChildIndex] > arr[maxIndex]) {
                maxIndex = leftChildIndex;
            }
            if (rightChildIndex < n && arr[rightChildIndex] > arr[maxIndex]) {
                maxIndex = rightChildIndex;
            }
            if (maxIndex == parentIndex) {
                //just break and don't swap
                break;
            }
            //swap
            int swap = arr[parentIndex];
            arr[parentIndex] = arr[maxIndex];
            arr[maxIndex] = swap;
            parentIndex = maxIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {14, 4, 20, 1, 16, 10, 30};
        heapSort(arr);
        printArray(arr);
    }
}
