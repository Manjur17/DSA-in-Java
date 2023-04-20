package Strings;

public class CheckSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            arr[ch - 'a'] = -1;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != -1) {
                return false;
            }
        }

        return true;
    }
}
