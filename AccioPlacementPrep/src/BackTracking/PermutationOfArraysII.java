package BackTracking;

import java.util.*;
//https://leetcode.com/problems/permutations-ii/description/
public class PermutationOfArraysII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        helper(0, nums, set);
        return new ArrayList<>(set);
    }

    private void helper(int index, int[] nums, HashSet<List<Integer>> set) {
        if (index == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            set.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            helper(index + 1, nums, set);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
