package Strings;

import java.util.Scanner;

public class PrintAllPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        printPalindromicSubstrings(str);
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static void printPalindromicSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ans = str.substring(i, j);
                if (isPalindrome(ans)) {
                    count++;
                    System.out.println(ans);
                }
            }
        }
        System.out.println("The total number of palindromic substring are: " + count);
    }
}
