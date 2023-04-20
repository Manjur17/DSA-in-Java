package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int count = 0, majorityCandidate = -1;

        for (int candidate : arr) {
            if (count == 0) {
                majorityCandidate = candidate;
            }

            if (majorityCandidate == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return majorityCandidate;
    }

    public static int majorityElementBrute(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int ans = 0, max = 0;
        for (int i : nums) {
            if (map.get(i) > max) {
                ans = i;
                max = map.get(i);
            }
        }
        return ans;
    }
}
