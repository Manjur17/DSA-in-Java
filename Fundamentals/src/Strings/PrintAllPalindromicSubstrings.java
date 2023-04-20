package Strings;

import java.util.Scanner;

public class PrintAllPalindromicSubstrings {
    public static boolean checkPalindrome(String str) {
        int start =0,end = str.length()-1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void printPalindromicSubstrings(String str) {
        int count = 0;
        for (int start = 0; start < str.length(); start++){
            for (int end = start+1; end <= str.length(); end++){
                String ans = str.substring(start, end);
                if (checkPalindrome(ans)){
                    ++count;
                    System.out.println(ans);
                }
            }
        }
        System.out.println("The total number of palindromic substring are: " + count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        printPalindromicSubstrings(str);
    }
}
