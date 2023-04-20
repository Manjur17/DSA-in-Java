package Strings;

import java.util.ArrayList;

public class PatternSearchingRKP {
    //Search  Pattern (Rabin-Karp Algorithm)
    ArrayList<Integer> search(String pat, String txt) {
        int patHash = 0, txtHash = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();
        for (int i = 0; i < m; i++) {
            patHash += (pat.charAt(i) - 'a');
            txtHash += (txt.charAt(i) - 'a');
        }

        if (patHash == txtHash && pat.equals(txt.substring(0, m))) {
            list.add(1);
        }
        for (int i = m; i < n; i++) {
            txtHash -= (txt.charAt(i - m) - 'a');
            txtHash += (txt.charAt(i) - 'a');

            if (patHash == txtHash && pat.equals(txt.substring(i - m + 1, i + 1))) {
                list.add(i - m + 2); //1 based indexing
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }
        return list;
    }
}
