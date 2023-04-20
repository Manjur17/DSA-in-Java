package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionToKEqualSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(canPartitionKSubsets(arr, k));
    }

    public static boolean canPartitionKSubsets(int[] arr, int k) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        //sum%k must equal to 0 if not just return false
        //if we have to divide the array greater than array size return false(we can't)
        if (sum % k != 0 || arr.length < k) return false;

        //sort so we can take last element and start filling our bucket
        Arrays.sort(arr);

        //our target is sum/k, and we have to find this in nums, k times then it is valid
        return check(arr, sum / k, arr.length - 1, new int[k]);

    }

    public static boolean check(int[] arr, int target, int idx, int[] bucket) {

        //we have taken all the elements
        if (idx == -1) return true;

        //start filling the buckets
        for (int i = 0; i < bucket.length; i++) {

            //can we take this ith element
            if (bucket[i] + arr[idx] <= target) {

                //if we take this element
                bucket[i] += arr[idx];

                //go to next element (in our case go to smallest ele bcz we sorted)
                //if we can fill all buckets then return true
                if (check(arr, target, idx - 1, bucket))
                    return true;

                //means we can't fill other buckets if we take ith element so leave this element
                bucket[i] -= arr[idx];

            }

            //if our bucket is empty means we have not taken any elements in the buckets
            if (bucket[i] == 0)
                break;

        }

        //all buckets are full but i is pointing to some element (elements still left)
        //or our bucket is empty means we haven't taken any element (not valid)
        return false;

    }
}
