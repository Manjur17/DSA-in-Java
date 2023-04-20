package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(nonrepeatingCharacter(s1));
        System.out.println(nonRepeatingCharForStream(s1));

    }

    static char nonRepeatingCharForStream(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == -1) {
                arr[s.charAt(i) - 'a'] = i;
            } else {
                arr[s.charAt(i) - 'a'] = -2;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 0) {
                res = Math.min(res, arr[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ? '$' : s.charAt(res);
    }

    static char nonrepeatingCharacter(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return '$';
    }
}
