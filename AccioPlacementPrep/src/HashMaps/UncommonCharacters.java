package HashMaps;

import java.util.*;

public class UncommonCharacters {
    String UncommonChars(String A, String B) {
        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for (int i = 0; i < A.length(); i++) {
            freqA[A.charAt(i) - 'a']++;
        }

        for (int i = 0; i < B.length(); i++) {
            freqB[B.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freqA[i] >= 1 && freqB[i] == 0 || freqA[i] == 0 && freqB[i] >= 1) {
                sb.append(((char) (i + 'a')));
            }
        }

        return (sb.length() == 0) ? "-1" : sb.toString();
    }
}
