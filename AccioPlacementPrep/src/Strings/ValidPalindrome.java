package Strings;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isValidCharacter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static boolean isPalindrome(String s) {
        //remove faltu characters
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isValidCharacter(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
        //convert to lowercase
        String temp = str.toString().toLowerCase();
        //check for palindrome
        return checkPalindrome(temp);
    }

    private static boolean checkPalindrome(String str) {
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

}
