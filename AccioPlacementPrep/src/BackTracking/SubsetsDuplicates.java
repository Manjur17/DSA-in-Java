package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 2};
        System.out.println(subsetsWithDup(arr));
    }

    private static void findSubsets(int idx, List<List<Integer>> ans, int[] arr, List<Integer> ds) {

        ans.add(new ArrayList<>(ds));

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }

            ds.add(arr[i]);
            findSubsets(i + 1, ans, arr, ds);
            ds.remove(ds.size() - 1);   //removing the pick element before moving to the not picked recursion
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, ans, nums, new ArrayList<>());
        return ans;
    }
}
