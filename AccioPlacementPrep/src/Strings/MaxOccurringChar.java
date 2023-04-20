package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(getMaxOccuringChar(str));
    }

    public static char getMaxOccuringChar(String str) {
        int[] frequency = new int[26];
        int maxFreq = 0;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            frequency[idx]++;
            maxFreq = Math.max(maxFreq, frequency[idx]);
        }
        char ans = '\0';
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFreq) {
                ans = (char) (i + 97);
                break;
            }
        }
        return ans;
    }
}
