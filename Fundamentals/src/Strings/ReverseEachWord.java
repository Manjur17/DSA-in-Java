package Strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return ""; //Empty String
        }
        StringBuilder revAns = new StringBuilder();
        int currentWordStarts = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                //reverse the word
                StringBuilder revWord = new StringBuilder();
                for (int j = currentWordStarts; j < i; j++) {
                    revWord.insert(0, str.charAt(j));
                }
                revAns.append(revWord).append(" ");
                currentWordStarts = i + 1;
            }
            if (i == str.length() - 1) {
                //reverse the word
                for (int j = i; j >= currentWordStarts; j--) {
                    revAns.append(str.charAt(j));
                }
            }

        }
        return revAns.toString();
    }

    //more optimized
    public static String reverse(String str, int start, int end) {
        StringBuilder ans = new StringBuilder();
        while (start < end) {
            ans.insert(0, str.charAt(start));
            start++;
        }
        return ans.toString();
    }

    public static String reverseString2(String str) {
        if (str.length() == 0) {
            return ""; //Empty String
        }
        int i = 0;
        int previousSpaceIndex = -1;
        StringBuilder ans = new StringBuilder();
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                ans.append(reverse(str, previousSpaceIndex + 1, i)).append(" ");
                previousSpaceIndex = i;
            }
        }
        ans.append(reverse(str, previousSpaceIndex + 1, i)).append(" ");
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String revAns = reverseString(str);
        System.out.println("The reverse of String from approach 1 is: " + revAns);
        String revAns1 = reverseString2(str);
        System.out.println("The reverse of String from approach 1 is: " + revAns1);
    }
}
