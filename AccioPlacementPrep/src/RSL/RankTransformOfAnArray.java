package RSL;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] array = Arrays.copyOf(arr, n);
        Arrays.sort(array);
        int rank = 1;
        for (int val : array) {
            if (!map.containsKey(val))
                map.put(val, rank++);
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }

    public int[] arrayRankTransformII(int[] a) {
        int n = a.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = a[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (x, y) -> x[0] - y[0]);
        int[] ans = new int[n];
        int rank = 1;
        for (int i = 0; i < n; ) {
            int j = i;
            int count = 1;
            while (j < n - 1 && arr[j][0] == arr[j + 1][0]) {
                count++;
                j++;
            }

            for (int k = i; k < (i + count); k++) {
                ans[arr[k][1]] = rank;
            }

            rank++; //for next iteration
            i += count;
        }

        return ans;
    }
}
