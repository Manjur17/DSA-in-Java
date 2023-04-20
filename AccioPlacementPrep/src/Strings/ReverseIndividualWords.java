package Strings;

public class ReverseIndividualWords {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int lastSpaceIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if ((i == s.length() - 1) || s.charAt(i) == ' ') {
                int reverseStrIndex = (i == s.length() - 1) ? i : i - 1;
                for (; reverseStrIndex > lastSpaceIndex; reverseStrIndex--) {
                    ans.append(s.charAt(reverseStrIndex));
                }
                if (i != s.length() - 1) {
                    ans.append(' ');
                }
                lastSpaceIndex = i;
            }
        }
        return new String(ans);
    }
}
