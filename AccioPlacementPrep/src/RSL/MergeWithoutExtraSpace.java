package RSL;

public class MergeWithoutExtraSpace {
    //TC - O(nm)
    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[0]) {
                // swap
                long temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Using insertion sort idea since array2 is almost sorted after swapping
                long key = arr2[0];

                int j = 1;
                while (j < m && key > arr2[j]) {
                    arr2[j - 1] = arr2[j];
                    j++;
                }

                arr2[j - 1] = key;
            }
        }
    }
}
