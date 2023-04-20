package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = solve(str);
        if (ch != '1')
            System.out.println(ch);
        else
            System.out.println(-1);
    }

    private static char solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '1';
    }

    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstNonRepeating(String str) {
        int[] freq = new int[256]; // array to store First Index

        // initializing all elements to -1
        for (int i = 0; i < 256; i++)
            freq[i] = -1;

        // sets all repeating characters to -2 and non-repeating characters
        // contain the index where they occur
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == -1) {
                freq[str.charAt(i)] = i;
            } else {
                freq[str.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < 256; i++) {

            // If this character is not -1 or -2 then it
            // means that this character occurred only once
            // so find the min index of all characters that
            // occur only once, that's our first index
            if (freq[i] >= 0)
                res = Math.min(res, freq[i]);
        }

        // if res remains  Integer.MAX_VALUE, it means there are no
        // characters that repeat only once or the string is empty
        if (res == Integer.MAX_VALUE) return -1;

        else return res;
    }
}
