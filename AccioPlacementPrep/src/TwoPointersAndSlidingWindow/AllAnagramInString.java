package TwoPointersAndSlidingWindow;

import java.util.*;

public class AllAnagramInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pat = sc.next();
        System.out.println(findAnagrams(pat, text));
    }

    public static List<Integer> findAnagrams(String txt, String pat) {
        List<Integer> list = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        if (m > n) {
            return list;
        }
        int[] freqText = new int[26];
        int[] freqPat = new int[26];
        for (int i = 0; i < m; i++) {
            freqText[txt.charAt(i) - 'a']++;
            freqPat[pat.charAt(i) - 'a']++;
        }
        //check for 1st window
        if (Arrays.equals(freqText, freqPat)) {
            list.add(0);
        }

        for (int i = m; i < n; i++) {
            freqText[txt.charAt(i) - 'a']++;
            freqText[txt.charAt(i - m) - 'a']--;
            if (Arrays.equals(freqText, freqPat)) {
                list.add(i - m + 1);
            }
        }

        return list;
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
