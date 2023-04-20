package TwoPointersAndSlidingWindow;

public class MaximizeTheConfusionOfExam {
    //Same questions as Maximum Ones After Modification
    private int count(String s, int k, char t) {
        int ans = 0, start = 0, flips = 0, n = s.length();
        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);
            if (ch == t) flips++;

            while (flips > k) {
                if (s.charAt(start) == t) flips--;
                start++;
            }

            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }

    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(count(answerKey, k, 'F'), count(answerKey, k, 'T'));
    }

    public int maxConsecutiveAnswersII(String answerKey, int k) {
        char[] arr = answerKey.toCharArray();
        int n = arr.length;
        int i = 0, j = 0, flips = 0, max1 = 0;
        while (j < n) {
            if (arr[j] == 'F') flips++;

            while (flips > k) {
                if (arr[i] == 'F') flips--;
                i++;
            }
            max1 = Math.max(max1, (j - i + 1));
            j++;
        }
        j = 0;
        i = 0;
        flips = 0;
        int max2 = 0;
        while (j < n) {
            if (arr[j] == 'T') flips++;

            while (flips > k) {
                if (arr[i] == 'T') flips--;
                i++;
            }
            max2 = Math.max(max2, (j - i + 1));
            j++;
        }

        return Math.max(max1, max2);
    }

    public int maxConsecutiveAnswers1Go(String answerKey, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int maxLen = 1, left = 0, n = answerKey.length();

        for (int right = 0; right < n; right++) {
            char ch = answerKey.charAt(right);
            // maxFrequency of either 'T' or 'F'
            maxFreq = Math.max(maxFreq, ++freq[ch - 'A']);

            //letterToChange = currentWindowLen - maxFreqLetter ('T' or 'F')
            while (right - left + 1 - maxFreq > k) {
                freq[answerKey.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
