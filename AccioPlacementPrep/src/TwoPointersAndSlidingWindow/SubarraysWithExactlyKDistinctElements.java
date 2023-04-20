package TwoPointersAndSlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithExactlyKDistinctElements {
    //Count of sub arrays having exactly K distinct elements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = subarraysWithKDistinct(arr, k);
        System.out.println(ans);
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        return (atMostK(nums, n, k) - atMostK(nums, n, k - 1));
    }

    private static int atMostK(int[] arr, int n, int k) {
        //Count Of Sub-arrays Having At Most K Unique Characters
        int start = 0, end = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // pair(distinct integer N, count of distinct integer N)

        while (end < n) {

            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            while (map.size() > k) { //map.size represents no of distinct integers in the sub-array so far
                //decrease the window size so that at most k distinct in our current window
                int freq = map.get(arr[start]);
                map.put(arr[start], --freq);
                if (freq == 0) {
                    map.remove(arr[start]); //remove it as there are no arr[start] in the current window
                }
                start++;
            }

            count += (end - start + 1);
            end++;
        }
        return count;
    }
}
