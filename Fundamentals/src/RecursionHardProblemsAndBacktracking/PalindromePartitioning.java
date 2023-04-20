package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        funcPartition(0, s, ans, ds);
        return ans;
    }

    private void funcPartition(int idx, String s, List<List<String>> ans, List<String> ds) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                //partition is possible
                ds.add(s.substring(idx, i + 1));
                funcPartition(i + 1, s, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
