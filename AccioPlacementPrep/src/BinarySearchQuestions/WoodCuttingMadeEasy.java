package BinarySearchQuestions;

public class WoodCuttingMadeEasy {
    static int solve(int[] tree, int k) {
        int low = 1;
        int high = (int) 1e6; //from constraints
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(tree, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] tree, int mid, int k) {
        long sum = 0;
        for (int x : tree) {
            if (x > mid) {
                sum += (x - mid);
            }
        }
        return sum >= k;
    }
}
