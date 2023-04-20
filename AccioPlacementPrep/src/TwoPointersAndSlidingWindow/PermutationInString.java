package TwoPointersAndSlidingWindow;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m > n)
            return false;
        int[] freqText = new int[26];
        int[] freqPat = new int[26];
        for (int i = 0; i < m; i++) {
            freqText[s2.charAt(i) - 'a']++;
            freqPat[s1.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freqText, freqPat)) {
            return true;
        }

        for (int i = m; i < n; i++) {
            freqText[s2.charAt(i) - 'a']++;
            freqText[s2.charAt(i - m) - 'a']--;
            if (areSame(freqPat, freqText)) {
                return true;
            }
        }

        return false;
    }

    private static boolean areSame(int[] freqPat, int[] freqText) {
        for (int i = 0; i < 26; i++) {
            if (freqPat[i] != freqText[i]) {
                return false;
            }
        }
        return true;
    }
}
