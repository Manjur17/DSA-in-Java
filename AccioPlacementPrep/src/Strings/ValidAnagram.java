package Strings;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for (String s : query) {
            int count = 0;
            for (String str : dictionary) {
                if (isAnagram(s, str)) {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
