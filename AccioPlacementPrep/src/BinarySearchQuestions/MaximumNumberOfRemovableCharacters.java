package BinarySearchQuestions;

import java.util.Scanner;

public class MaximumNumberOfRemovableCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumRemovals(s, p, arr));
    }

    public static int maximumRemovals(String s, String p, int[] removable) {
        int low = 0;
        int high = removable.length;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(s, mid, p, removable)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(String s, int mid, String p, int[] removable) {
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < mid; i++) {
            str.setCharAt(removable[i], '*');
        }
        s = str.toString();

        return isSubsequence(s, p);
    }

    private static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s2.length();
    }
}
