package Strings;

import java.util.Scanner;

public class CheckIfFrequenciesCanBeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sameFreq(s));
    }

    boolean sameFreqII(String s) {
        int[] freq = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            count = Math.max(count, freq[ch - 'a']);
        }

        boolean isRemoved = false;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0 || freq[i] == count) continue;

            if (!isRemoved && freq[i] != count) {
                isRemoved = true;
            } else {
                if (Math.abs(freq[i] - count) != 1)
                    return false;
            }
        }

        return true;
    }

    static boolean sameFreq(String str) {
        // code here
        int l = str.length();

        // fill frequency array
        int[] freq = new int[M];

        for (int i = 0; i < l; i++)
            freq[getIdx(str.charAt(i))]++;

        // if all frequencies are same, then return true
        if (allSame(freq, M))
            return true;

       /*  Try decreasing frequency of all character
           by one and then check all equality of all
           non-zero frequencies */
        for (char c = 'a'; c <= 'z'; c++) {
            int i = getIdx(c);

            // Check character only if it occurs in str
            if (freq[i] > 0) {
                freq[i]--;

                if (allSame(freq, M))
                    return true;
                freq[i]++;
            }
        }

        return false;
    }

    static boolean allSame(int[] freq, int N) {
        int same = 0;

        // get first non-zero element
        int i;
        for (i = 0; i < N; i++) {
            if (freq[i] > 0) {
                same = freq[i];
                break;
            }
        }

        // check equality of each element with
        // variable same
        for (int j = i + 1; j < N; j++)
            if (freq[j] > 0 && freq[j] != same)
                return false;

        return true;
    }

    static final int M = 26;

    // Utility method to get index of character ch
    // in lower alphabet characters
    static int getIdx(char ch) {
        return (ch - 'a');
    }
}
