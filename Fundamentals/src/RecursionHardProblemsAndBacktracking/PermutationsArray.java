package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsArray {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutation(0,nums,ans);
        return ans;
    }

    private void findPermutation(int idx, int[] arr, List<List<Integer>> ans) {
        if (idx == arr.length){
            //copy the ds to ans
            List<Integer> ds = new ArrayList<>();
            for (int j : arr) {
                ds.add(j);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(i,idx,arr);
            findPermutation(idx+1,arr,ans);
            swap(i,idx,arr); //re-swap during backtracking
        }
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
