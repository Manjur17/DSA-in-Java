package TwoPointersAndSlidingWindow;

//https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        int maxLen = 0;
        int[] freq = new int[26];

        for (int i = 1; i <= 26; i++) {
            int start = 0, end = 0, uniqueChar = 0;

            while (end < s.length()) {
                boolean valid = true;
                if (freq[s.charAt(end) - 'a']++ == 0) uniqueChar++;

                // need exactly i unique characters
                while (uniqueChar > i) {
                    if (freq[s.charAt(start) - 'a']-- == 1) uniqueChar--;
                    start++;
                }


                // if the string has any character with less than k occurrences, the string is invalid
                for (int j = 0; j < 26; j++) {
                    if (freq[j] > 0 && freq[j] < k) {
                        valid = false;
                        break;
                    }
                }

                if (valid) maxLen = Math.max(maxLen, end - start);

                end++;
            }

        }

        return maxLen;
    }
}
