package BackTracking;

import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(arr, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombination(int[] arr, int idx, int target, List<List<Integer>> ans, List<Integer> list) {
        if (target < 0) return;

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }


        for (int i = idx; i < arr.length; i++) {
            if (i != idx && arr[i] == arr[i - 1]) {
                continue;
            }

            list.add(arr[i]);

            findCombination(arr, i + 1, target - arr[i], ans, list);

            list.remove(list.size() - 1);   //removing the pick element before moving to the not picked recursion
        }
    }
}
