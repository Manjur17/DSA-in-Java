package Arrays;

import java.util.Arrays;
import java.util.Objects;

public class StringArrayIntersection {
    public static void main(String[] args) {
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        Arrays.sort(words1);
        Arrays.sort(words2);
        int i = 0, j = 0;
        int count = 0;
        while (i < words1.length && j < words2.length) {
            if (i > 0 && words1[i].equals(words1[i - 1])) {
                count--;
                i++;
            }
            if (j > 0 && words2[j].equals(words2[j - 1])) {
                count--;
                j++;
            }
            if (words1[i].compareTo(words2[j]) == 0) {
                count++;
                i++;
                j++;
            } else if (words1[i].compareTo(words2[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}
