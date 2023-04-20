package BackTracking;

import java.util.*;

public class RestoreIPAddresses {
    //leading zeros case
    // if (j != i && s.charAt(i) == '0') return;
    //if we are not at the first index of our current substring, check if the first index is zero.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(restoreIpAddresses(str));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() > 12) return list;
        helper(s, 0, 0, "", list);
        return list;
    }

    private static void helper(String s, int idx, int dots, String currIP, List<String> list) {
        if (dots == 4 && idx == s.length()) { // Base
            list.add(currIP.substring(0, currIP.length() - 1));
            return;
        }
        if (dots > 4) {
            return;
        }

        for (int i = idx; i < idx + 3 && i < s.length(); i++) {
            int val = Integer.parseInt(s.substring(idx, i + 1));
            if (val < 256 && (idx == i || s.charAt(idx) != '0')) {
                helper(s, i + 1, dots + 1, currIP + s.substring(idx, i + 1) + ".", list);
            }
        }
    }

    private void helper2(String s, int idx, int dots, String currIP, List<String> list) {
        if (dots == 4 && idx == s.length()) { // Base
            list.add(currIP.substring(0, currIP.length() - 1));
            return;
        }
        if (dots > 4) {
            return;
        }

        for (int i = idx; i < Math.min(idx + 3, s.length()); i++) {
            int val = Integer.parseInt(s.substring(idx, i + 1));
            if (val < 256 && (idx == i || s.charAt(idx) != '0')) {
                helper2(s, i + 1, dots + 1, currIP + s.substring(idx, i + 1) + ".", list);
            }
        }
    }
}
