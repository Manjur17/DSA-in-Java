package Strings;

public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            while (i < n && isValid(sb.charAt(i))) i++;
            while (j >= 0 && isValid(sb.charAt(j))) j--;

            if (i < j) {
                //swap
                char ch = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, ch);
                i++;
                j--;
            }
        }
        return sb.toString();
    }

    public boolean isValid(char ch) {
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U';
    }
}
