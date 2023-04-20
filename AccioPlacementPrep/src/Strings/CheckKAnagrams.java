package Strings;

import java.util.Scanner;

public class CheckKAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        int k = sc.nextInt();
        if (areKAnagrams(s, s1, k)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static boolean areKAnagrams(String s1, String s2, int k) {
        if (s1.length() != s2.length()) return false;

        int[] arr = new int[26];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (arr[ch - 'a'] > 0)  //common chars in s1 & s2
                arr[ch - 'a']--;
            else
                count++; //uncommon chars in s1 & s2
        }

        return count <= k;

    }
}
