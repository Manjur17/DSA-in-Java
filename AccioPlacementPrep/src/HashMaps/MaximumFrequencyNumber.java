package HashMaps;

import java.util.HashMap;

public class MaximumFrequencyNumber {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 2, 2, 2, 2, 6, 11, 11, 12, 12, 12};
        int[] arr = {1, 4, 5};
        System.out.println(maxFrequencyNumber(arr.length, arr));
    }

    public static int maxFrequencyNumber(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > max) {
                ans = arr[i];
                max = map.get(arr[i]);
            }
        }
        return ans;
    }

    static int maxFreqEfficient(int[] arr, int n) {
        // using moore's voting algorithm
        int res = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                res = arr[i];
                count = 1;
            }

            if (arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }
        }

        return arr[res];
    }
}
