package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            // handle odd length palindrome (current character)
            count += palindromeCount(s, i, i);

            // handle even length palindrome (current character and next character)
            count += palindromeCount(s, i, i + 1);
        }
        return count;
    }

    public static int palindromeCount(String str, int leftPointer, int rightPointer) {
        int count = 0;
        while (leftPointer >= 0 && rightPointer < str.length() && str.charAt(leftPointer) == str.charAt(rightPointer)) {

            count++;
            leftPointer--;
            rightPointer++;
        }

        return count;
    }

    //Length of palindrome sub-string must be greater than or equal to 2.
    public int palindromeCountGFGVersion(String str, int leftPointer, int rightPointer) {
        int count = 0;
        while(leftPointer >= 0 && rightPointer < str.length() && str.charAt(leftPointer) == str.charAt(rightPointer)) {

            if(rightPointer - leftPointer + 1 >= 2) count++;
            leftPointer--;
            rightPointer++;
        }

        return count;
    }
}
