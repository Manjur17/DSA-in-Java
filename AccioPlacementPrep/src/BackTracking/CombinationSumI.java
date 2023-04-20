package BackTracking;

import java.util.*;

public class CombinationSumI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(combinationSum(arr, 5));
    }

    //here arrays has distinct elements
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            list.add(arr[i]);

            findCombination(arr, i, target - arr[i], ans, list);

            list.remove(list.size() - 1);   //removing the pick element before moving to the not picked recursion
        }
    }

    //here array has duplicates elements
    static ArrayList<ArrayList<Integer>> combinationSumGFG(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findCombination(arr, 0, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombination(int[] arr, int idx, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list) {
        if (target < 0) return;

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }


        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }

            list.add(arr[i]);

            findCombination(arr, i, target - arr[i], ans, list);

            list.remove(list.size() - 1);   //removing the pick element before moving to the not picked recursion
        }
    }
}
