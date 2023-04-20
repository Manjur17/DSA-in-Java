package Stack;

import java.util.Stack;

//similar question -> Lexicographically smallest subsequence possible by removing a character from given string
//here k = 1 and not arr.length - k (char[] ans = removeKDigits(arr, k)

public class LexicographicallySmallestKLengthSubsequence {
    public static void main(String[] args) {
        String s = "zxvsjas";
        int k = 3;
        System.out.println(mostCompetitive(s, k));
    }

    public static String mostCompetitive(String s, int k) {
        char[] arr = s.toCharArray();

        if (k == arr.length) {
            return s;
        }

        char[] ans = removeKDigits(arr, arr.length - k);
        return String.valueOf(ans);
    }

    public static char[] removeKDigits(char[] arr, int k) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            char val = arr[i];
            while (!st.empty() && k > 0 && st.peek() > val) {
                st.pop();
                k--;
            }
            st.push(val);
        }
        while (!st.empty() && k > 0) {
            st.pop();
            k--;
        }

        char[] ans = new char[st.size()];
        int j = ans.length - 1;
        while (!st.isEmpty()) {
            ans[j--] = st.pop();
        }

        return ans;
    }
}
