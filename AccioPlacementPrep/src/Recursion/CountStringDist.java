package Recursion;

public class CountStringDist {
    public int strDist(String str, String sub) {
        return helper(str, sub, 0);
    }

    private int helper(String str, String sub, int len) {
        if (str.length() < sub.length()) {
            return 0;
        }


        if (str.startsWith(sub))
            return helper(str.substring(sub.length()), sub, len + sub.length());

        return helper(str.substring(1), sub, len);
    }
}
