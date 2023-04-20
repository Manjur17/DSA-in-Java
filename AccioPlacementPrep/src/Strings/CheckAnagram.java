package Strings;

import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pat = sc.next();
        System.out.println(search(pat, text));
        System.out.println(checkInclusion(pat, text));
    }

    static int search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();
        int[] freqText = new int[26];
        int[] freqPat = new int[26];
        for (int i = 0; i < m; i++) {
            freqText[txt.charAt(i) - 'a']++;
            freqPat[pat.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = m; i < n; i++) {
            if (areSame(freqPat, freqText)) {
                count++;
            }
            freqText[txt.charAt(i) - 'a']++;
            freqText[txt.charAt(i - m) - 'a']--;
        }
        //last window
        if (areSame(freqPat, freqText)) {
            count++;
        }
        return count;
    }

    public static boolean checkInclusion(String s1, String s2) {
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
        int count = 0;
        for (int i = m; i < n; i++) {
            if (areSame(freqPat, freqText)) {
                return true;
            }
            freqText[s2.charAt(i) - 'a']++;
            freqText[s2.charAt(i - m) - 'a']--;
        }
        //last window
        return areSame(freqPat, freqText);
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
