package HashMaps;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int count = 0;
        boolean isOddValueTaken = false;

        for (int i = 0; i < 256; i++) {
            if (arr[i] == 0) continue;

            if (arr[i] % 2 == 0) {
                count += arr[i];
            } else {
                if (isOddValueTaken)
                    count += arr[i] - 1;
                else {
                    isOddValueTaken = true;
                    count += arr[i];
                }
            }
        }

        return count;
    }
}
