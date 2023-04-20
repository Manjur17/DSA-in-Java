package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(firstRep(s1));
        System.out.println(firstRepBetter(s1));
        System.out.println(firstRepEfficient(s1));
    }

    static char firstRepBetter(String s) {
        //single traversal
        boolean[] arr = new boolean[26];
        char res = '#';
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!arr[s.charAt(i) - 'a']) {
                //mark it visited
                arr[s.charAt(i) - 'a'] = true;
            } else {
                res = s.charAt(i);
            }
        }

        return res;
    }

    static char firstRepEfficient(String s) {
        //1 traversal
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == -1) {
                arr[s.charAt(i) - 'a'] = i;
            } else {
                //repeated char
                res = Math.min(res, arr[s.charAt(i) - 'a']);
            }
        }
        return (res == Integer.MAX_VALUE ? '#' : s.charAt(res));
    }

    static char firstRep(String s) {
        //two traversal
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] > 1) {
                return s.charAt(i);
            }
        }
        return '#';
    }
}
