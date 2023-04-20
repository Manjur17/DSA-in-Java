package BackTracking;

import java.util.*;

public class ArraysSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        printSubsets(arr, 0, new ArrayList<>());
        System.out.println();
        System.out.println(returnSubsets(arr, 0, new ArrayList<>()));
        System.out.println(subsets(arr));
    }

    private static void printSubsets(int[] arr, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            System.out.print(list + " ");
            return;
        }
        list.add(arr[index]);
        printSubsets(arr, index + 1, list);
        list.remove(list.size() - 1);
        printSubsets(arr, index + 1, list);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, 0, list, new ArrayList<>());
        return list;
    }

    private static void helper(int[] arr, int idx, List<List<Integer>> ans, ArrayList<Integer> list) {

        ans.add(new ArrayList<>(list));

        for (int i = idx; i < arr.length; i++) {
            list.add(arr[i]);
            helper(arr, i + 1, ans,list);
            list.remove(list.size() - 1);   //removing the pick element before moving to the not picked recursion
        }
    }

    private static ArrayList<Integer> returnSubsets(int[] arr, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return new ArrayList<>(list);
        }
        list.add(arr[index]);
        ArrayList<Integer> left = returnSubsets(arr, index + 1, list);
        list.remove(list.size() - 1);
        ArrayList<Integer> right = returnSubsets(arr, index + 1, list);
        left.addAll(right);
        return left;
    }

    public static List<List<Integer>> subsetsII(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        ans = helper(nums, 0, new ArrayList<>());
//        return ans;

        //method -2 -> not passing list in argument
        List<List<Integer>> list = new ArrayList<>();
        helperI(nums, 0, list, new ArrayList<>());
        return list;
    }

    //Method-1
    private static List<List<Integer>> helper(int[] arr, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(arr[index]);
        List<List<Integer>> left = helper(arr, index + 1, list);
        list.remove(list.size() - 1);
        List<List<Integer>> right = helper(arr, index + 1, list);

        left.addAll(right);
        return left;
    }

    //Method-2
    private static void helperI(int[] arr, int index, List<List<Integer>> ans, ArrayList<Integer> list) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        helperI(arr, index + 1, ans, list);
        list.remove(list.size() - 1);
        helperI(arr, index + 1, ans, list);
    }
}
