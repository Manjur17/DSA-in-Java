package BinarySearchQuestions;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;

        if (m > n)
            return findMedianSortedArrays(arr2, arr1);//ensuring that binary search happens on minimum size array

        int low = 0, high = m;
        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 != 0)
                    return Math.max(l1, l2);
                else
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } else if (l1 > r2) high = cut1 - 1; //check 1
            else low = cut1 + 1; //check 2
        }
        return 0.0;
    }
}
