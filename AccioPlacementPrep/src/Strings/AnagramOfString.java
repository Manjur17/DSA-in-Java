package Strings;

import java.util.*;
import java.util.Scanner;

public class AnagramOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        System.out.println(remAnagrams(s, s1));
    }



    public static int remAnagrams(String s, String s1) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']--;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(freq[i]);
        }

        return count;
    }
}
