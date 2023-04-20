package SeachingAndSorting;

public class KthLargestElement {
    //Quick Select
    public int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int pivot = partition(arr, low, high);
            if (pivot == n - k)
                return arr[pivot];
            else if (pivot > n - k)
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
