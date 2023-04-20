package BackTracking;

import java.util.*;
//https://leetcode.com/problems/permutations/
public class PermutationOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr));
        System.out.println(permute2(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] hash = new boolean[nums.length];
        helper(nums, list, new ArrayList<>(), hash);
        return list;
    }

    //Method -1 using a hash array
    private static void helper(int[] arr, List<List<Integer>> list, List<Integer> ds, boolean[] hash) {
        if (ds.size() == arr.length) {
            list.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            //check if the option is available or not
            if (!hash[i]) {
                hash[i] = true; //mark is as taken
                ds.add(arr[i]);
                helper(arr, list, ds, hash);
                ds.remove(ds.size() - 1); //remove it for further recursion calls
                hash[i] = false; //mark is as not taken
            }
        }
    }

    //Method -2 not using a hash array
    public static List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0, nums, list);
        return list;
    }

    private static void helper(int index, int[] arr, List<List<Integer>> ans) {
        if (index == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            helper(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
