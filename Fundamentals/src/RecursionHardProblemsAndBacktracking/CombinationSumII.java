package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, ans, candidates, target, new ArrayList<>());
        return ans;
    }

    private void findCombination(int idx, List<List<Integer>> ans, int[] arr, int target, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }
            if (target < arr[idx]) {
                break;
            }
            ds.add(arr[i]);
            findCombination(i+1, ans, arr, target - arr[i], ds);
            ds.remove(ds.size() - 1);   //removing the pick element before moving to the not picked recursion
        }
    }
}
