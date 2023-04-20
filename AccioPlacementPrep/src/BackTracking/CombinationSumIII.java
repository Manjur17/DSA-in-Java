package BackTracking;

import java.util.*;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombination(int idx, int k, int target, List<Integer> list, List<List<Integer>> ans) {
        if (target < 0) return;

        if (target == 0 && list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i <= 9; i++) {
            list.add(i);

            findCombination(i + 1, k, target - i, list, ans);

            list.remove(list.size() - 1);
        }
    }


    //total combinations of numbers that sum to target and combination size does not matter
    private void findCombination(int idx, int target, List<Integer> list, List<List<Integer>> ans) {
        if (target < 0) return;

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i <= 9; i++) {
            list.add(i);

            findCombination(i, target - i, list, ans);

            list.remove(list.size() - 1);
        }
    }
}
