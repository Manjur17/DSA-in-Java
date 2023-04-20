package TwoPointersAndSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(minWindowMap(s, t));
    }

    static String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) return "";

        int[] freq = new int[256];
        // creating map of t String
        for (int i = 0; i < n; i++) {
            freq[t.charAt(i)]++;
        }

        int minLength = Integer.MAX_VALUE, count = 0;
        String ans = "";
        int start = 0, end = 0; //start and end of window
        while (end < m) {
            if (freq[s.charAt(end)] > 0)
                count++; //include this char in the current window

            freq[s.charAt(end)]--; //signifies this char is encountered

            while (count == n) {
                //we have a window with n chars of t
                //current window is less than minLength
                if (minLength > end - start + 1) {
                    minLength = end - start + 1;
                    ans = s.substring(start, end + 1); // i = start point of ans
                }
                freq[s.charAt(start)]++;
                if (freq[s.charAt(start)] > 0)
                    count--; //exclude this char in the current window and shrink the window

                start++;
            }

            end++;
        }

        return ans;
    }

    static String minWindowMap(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) return "";
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int start = 0, end = 0, count = 0;

        while (end < m) {
            if (map.containsKey(s.charAt(end))) {
                if (map.get(s.charAt(end)) > 0) {
                    count++;
                }

                map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
            }

            while (count == n) {
                if (minLen > end - start + 1) {
                    minLen = end - start + 1;
                    ans = s.substring(start, end + 1); //end will be included in ans
                }
                if (map.containsKey(s.charAt(start))) {
                    map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                    if (map.get(s.charAt(start)) > 0) {
                        count--;
                    }
                }
                start++;
            }

            end++;
        }

        return ans;
    }
}
