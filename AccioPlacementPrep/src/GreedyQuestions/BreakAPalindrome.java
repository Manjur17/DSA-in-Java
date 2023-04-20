package GreedyQuestions;

public class BreakAPalindrome {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) return "";

        StringBuilder sb = new StringBuilder(palindrome);
        boolean flag = true;

        for (int i = 0; i < n / 2; i++) {
            if (palindrome.charAt(i) != 'a') {
                sb.setCharAt(i, 'a');
                flag = false;
                break;
            }
        }

        if (flag) {
            sb.setCharAt(n - 1, 'b');
        }

        return sb.toString();
    }
}
