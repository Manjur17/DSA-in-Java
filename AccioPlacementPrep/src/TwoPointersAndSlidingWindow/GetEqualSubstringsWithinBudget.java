package TwoPointersAndSlidingWindow;

public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int maxLen = 0, cost = 0;
        int start = 0, end = 0;
        while (end < n) {
            cost += Math.abs(s.charAt(end) - t.charAt(end));
            if (cost > maxCost) {
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
}
