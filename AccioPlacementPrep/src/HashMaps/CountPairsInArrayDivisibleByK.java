package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairsInArrayDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countKdivPairs(arr, k));
    }

    public static long countKdivPairs(int[] arr, int k) {
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            int rem = val % k;

            if (rem == 0) {
                //for 0 complementary k - rem is 0 as rem = 0 and rem = k - rem
                count += map.getOrDefault(0, 0);
            } else {
                //complementary is k - rem and rem = k - rem
                count += map.getOrDefault(k - rem, 0);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
