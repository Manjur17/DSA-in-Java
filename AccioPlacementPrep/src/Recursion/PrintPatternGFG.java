package Recursion;

import java.util.*;

public class PrintPatternGFG {
    public static void main(String[] args) {
        System.out.println(pattern(16));
    }

    static List<Integer> pattern(int N) {
        List<Integer> ans = new ArrayList<>();
        int org = N;
        ans.add(N);
        helper(N - 5, org, ans, true);
        return ans;
    }

    static void helper(int n, int org, List<Integer> ans, boolean flag) {
        if (n == org) {
            ans.add(n);
            return;
        }
        ans.add(n);
        if (flag) {
            if (n > 0) {
                helper(n - 5, org, ans, flag);
            } else {
                flag = false;
                helper(n + 5, org, ans, flag);
            }
        } else {
            helper(n + 5, org, ans, flag);
        }
    }
}
