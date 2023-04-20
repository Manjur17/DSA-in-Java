package Strings;

public class RemoveCharacter2 {
    static String removeChars(String s1, String s2) {
        int[] arr = new int[26];

        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a'] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (arr[s1.charAt(i) - 'a'] != -1) {
                sb.append(s1.charAt(i));
            }
        }

        return sb.toString();
    }
}
