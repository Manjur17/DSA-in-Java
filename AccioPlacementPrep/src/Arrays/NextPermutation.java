package Arrays;

public class NextPermutation {
    public void nextPermutation(int[] arr) {
        int ind1 = -1, n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind1 = i;
                break;
            }
        }

        if (ind1 != -1) {
            int ind2 = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > arr[ind1]) {
                    ind2 = i;
                    break;
                }
            }
            swap(arr, ind1, ind2);
        }

        reverse(arr, ind1 + 1, n - 1);
    }

    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
