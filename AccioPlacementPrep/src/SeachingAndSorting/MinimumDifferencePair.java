package SeachingAndSorting;

import java.util.*;

public class MinimumDifferencePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimum_difference(arr));
    }

    public static int minimum_difference(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {

            res = Math.min(res, nums[i] - nums[i - 1]);
        }

        return res;
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res, arr[i] - arr[i - 1]);
        }


        List<List<Integer>> ds = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == res) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ds.add(new ArrayList<>(list));
            }
        }
        return ds;
    }
}
