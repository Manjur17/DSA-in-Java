package Stack;

public class LexicographicallySmallestSubsequencePossibleByRemovingACharacter {
    static void firstSubsequence(String s) {

        // Store index of character to be deleted
        int isMax = -1;

        for (int i = 0; i < s.length() - 1; i++) {

            // If ith character > (i + 1)th character then store it
            if (s.charAt(i) > s.charAt(i + 1)) {
                isMax = i;
                break;
            }
        }

        // If any character found in non-alphabetical order then remove it
        if (isMax >= 0) {
            s = s.substring(0, isMax) + s.substring(isMax + 1);
        }

        // Otherwise remove last character
        else {
            s = s.substring(0, s.length() - 1);

        }

        System.out.print(s);
    }
}
