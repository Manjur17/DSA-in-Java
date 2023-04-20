package HashMaps;

import java.util.*;

public class MaximumDistanceBetweenSameElement {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr, n));
    }

    private static int solve(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            }

            int tempLen = i - map.get(arr[i]); //(end - start)
            if (tempLen > maxLen) {
                maxLen = tempLen;
            }
        }

        return maxLen;
    }
}
