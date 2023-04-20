package Recursion;

import java.util.Scanner;

public class CheckPalindromeRecursive {
    //Approach 1
    public static boolean checkPalindrome(String str,int startIndex,int endIndex) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(startIndex) != str.charAt(endIndex) || startIndex >= endIndex) {
            return false;
        }
        boolean smallAns = checkPalindrome(str,startIndex+1,endIndex-1);
        if (str.charAt(startIndex) == str.charAt(endIndex)) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean checkPalindrome(String str){
        return checkPalindrome(str,0,str.length()-1);
    }

    //Approach 2 (using Substring)
    public static boolean checkPalindromeBetter(String str){
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return checkPalindrome(str.substring(1,str.length()-1));
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("From Approach 1:  "+ checkPalindrome(str));
        System.out.println("From Approach 2:  "+ checkPalindromeBetter(str));
    }
}
