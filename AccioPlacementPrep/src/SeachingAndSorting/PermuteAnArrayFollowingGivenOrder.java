package SeachingAndSorting;

public class PermuteAnArrayFollowingGivenOrder {
    static void permute(int[] arr, int[] P, int n) {

        for (int i = 0; i < n; i++) {
            int next = i;

            // Check if it is already considered in cycle
            while (P[next] >= 0) {
                // Swap the current element according to the permutation in P
                swap(arr, i, P[next]);
                int temp = P[next];
                P[next] = -1; //corresponding move has been performed -> P[next] -= n;
                next = temp;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
