package Strings;

import java.util.Scanner;

public class StringPalindrome {
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
    }
}
