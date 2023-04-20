package Strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(pre)) {
                pre = pre.substring(0, pre.length() - 1); //pre is reduced
                if (pre.length() == 0) {
                    return "-1";  // no prefix common
                }
            }

        }

        return pre;
    }
}
