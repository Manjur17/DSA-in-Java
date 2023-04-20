package TwoPointersAndSlidingWindow;

public class LongestPalindromicSubstring {
    int length = 0, start = 0, end = 0; //for local var use as array

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {

            // handle odd length palindrome (current character)
            palindromeCount(s, i, i);

            // handle even length palindrome (current character and next character)
            palindromeCount(s, i, i + 1);
        }

        return s.substring(start, end + 1);
    }

    public void palindromeCount(String str, int leftPointer, int rightPointer) {
        while (leftPointer >= 0 && rightPointer < str.length() &&
                str.charAt(leftPointer) == str.charAt(rightPointer)) {

            if (rightPointer - leftPointer + 1 > length) {
                start = leftPointer;
                end = rightPointer;
                length = rightPointer - leftPointer + 1;
            }

            leftPointer--;
            rightPointer++;
        }
    }

    public String longestPalindromeBrute(String s) {
        int max = 1;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && (j - i + 1 > max)) {
                    max = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
