package Strings;

public class RemoveDuplicates {
    //GFG Version
    String removeDups(String s) {
        int[] freq = new int[26];

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 0) {
                ans.append(s.charAt(i));
                freq[s.charAt(i) - 'a']++;
            }
        }

        return ans.toString();
    }
}
