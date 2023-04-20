package BackTracking;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class PermutationDuplicates {
    public static void main(String[] args) {
        List<String> res = find_permutation("abb");
        for (String s : res) {
            System.out.print(s + " ");
        }
    }

    public static List<String> find_permutation(String s) {
        // Code here
        HashSet<String> set = new HashSet<>();
        permute(s, 0, set);
        List<String> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }

    static void permute(String str, int sI, HashSet<String> set) {
        if (sI == str.length()) {
            set.add(str);
            return;
        }

        for (int i = sI; i < str.length(); i++) {
            str = swap(str, i, sI);
            permute(str, sI + 1, set);
            str = swap(str, i, sI);
        }
    }

    static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
