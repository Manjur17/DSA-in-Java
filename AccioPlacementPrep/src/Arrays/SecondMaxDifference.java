package Arrays;

public class SecondMaxDifference {
    public static void find(int[] arr, long n) {
        int smallest = arr[0], secondsmallest = Integer.MAX_VALUE;
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            largest = Math.max(largest, arr[i]);
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        //second max difference is the difference between the largest element in array and second-smallest
        //element of array
        System.out.println(largest - secondsmallest);
    }
}
