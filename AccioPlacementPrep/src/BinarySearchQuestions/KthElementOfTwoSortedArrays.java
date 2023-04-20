package BinarySearchQuestions;

public class KthElementOfTwoSortedArrays {
    public long kthElement(int[] arr1, int[] arr2, int m, int n, int k) {

        if (m > n)
            return kthElement(arr2, arr1, n, m, k);//ensuring that binary search happens on minimum size array

        int low = Math.max(0, k - n), high = Math.min(k, m); //EDGE CASES

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = k - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2)
                high = cut1 - 1; //check 1
            else
                low = cut1 + 1; //check 2
        }
        return 0;

    }
}
