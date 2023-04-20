package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,ans,candidates,target,new ArrayList<>());
        return ans;
    }

    private void findCombination(int idx, List<List<Integer>> ans, int[] arr, int target, List<Integer> ds) {
        if (idx == arr.length){
            if (target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (target >= arr[idx]){
            ds.add(arr[idx]);
            findCombination(idx,ans,arr,target-arr[idx],ds);
            ds.remove(ds.size()-1);   //removing the pick element before moving to the not picked recursion
        }
        findCombination(idx+1,ans,arr,target,ds);
    }
}
