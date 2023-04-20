package TwoPointersAndSlidingWindow;

public class AtmostKFlips {
    //Maximum 1 after modification
    public int longestOnes(int[] a, int k) {
        int n = a.length;
        int start = 0, end = 0, flips = 0, ans = 0;

        while (end < n) {
            if (a[end] == 0) flips++;

            while (flips > k) {
                if (a[start] == 0) flips--;
                start++;
            }

            ans = Math.max(ans, (end - start + 1));
            end++;
        }

        return ans;
    }
}
