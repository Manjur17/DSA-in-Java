package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 2, 2};
        List<List<Integer>> ansList = subsets(arr);
//        for (List<Integer> list : ansList) {
//            System.out.print(list + "\t");
//        }
        System.out.println(ansList);
//        List<List<Integer>> ansList1 = subsetsDuplicates(arr1);
//        for (List<Integer> list : ansList1) {
//            System.out.print(list + "\t");
//        }

    }

    public static void findSubsets(int idx, int[] arr, List<List<Integer>> ans, int n, List<Integer> ds) {
        if (idx == n) {
            //print the subset and return
            ans.add(new ArrayList<>(ds));
            return;
        }

        findSubsets(idx + 1,arr,ans,n,ds); //Subsequence without including the element at current index
        ds.add(arr[idx]);

        findSubsets(idx + 1,arr,ans,n,ds); // Subsequence including the element at current index

        ds.remove(ds.size() - 1);  // Backtrack to remove the recently inserted element

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> path = new ArrayList<>();

        findSubsets(0, nums, path, nums.length,new ArrayList<>());
        return path;
    }

    private static void findSubsets(int idx, List<List<Integer>> ans, int[] arr, List<Integer> ds) {
        if (idx == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        findSubsets(idx+1, ans, arr, ds);
        ds.remove(ds.size() - 1);
        findSubsets(idx+1, ans, arr, ds);
    }

//    public static List<List<Integer>> subsetsDuplicates(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<>();
//        findSubsets(0, ans, nums, new ArrayList<>());
//        return ans;
//    }
}
