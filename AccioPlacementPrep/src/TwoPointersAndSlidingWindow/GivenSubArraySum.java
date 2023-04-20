package TwoPointersAndSlidingWindow;

public class GivenSubArraySum {
    static int subArraySum(int[] arr, int n, int sum) {
        int currSum = arr[0], start = 0, i;
        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If currSum exceeds the sum then remove the starting elements
            while (currSum > sum && start < i - 1) {
                currSum = currSum - arr[start];
                start++;
            }

            // If currSum becomes equal to sum,then return true
            if (currSum == sum) {
                int p = i - 1;
                System.out.println("Sum found between indexes " + start + " and " + p);
                return 1;
            }

            // Add this element to currSum
            if (i < n)
                currSum = currSum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int[] arr1 = {1 ,2, 3, 7, 5};
        int n = arr.length;
        int sum = 6;
//        System.out.println(subArraySum(arr, n, sum));
        System.out.println(subArraySum(arr1, arr1.length, 12));
    }
}
