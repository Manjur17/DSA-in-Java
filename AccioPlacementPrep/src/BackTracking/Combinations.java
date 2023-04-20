package BackTracking;

import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(combine(n, k));
    }

    public static List<List<Integer>> combine(int n, int k) {
        //not needed
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        List<List<Integer>> ans = new ArrayList<>();
        backTrack(n, k, 0, ans, new ArrayList<>());
        return ans;
    }

    private static void backTrack(int n, int k, int idx, List<List<Integer>> ans, ArrayList<Integer> list) {
        if (idx == n + 1) return;

        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < n; i++) {
            list.add(i + 1);

            backTrack(n, k, i + 1, ans, list);

            list.remove(list.size() - 1);
        }
    }

    private static void backTrack(int[] arr, int k, int idx, List<List<Integer>> ans, ArrayList<Integer> list) {
        if (idx == arr.length + 1) return;

        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            list.add(arr[i]);

            backTrack(arr, k, i + 1, ans, list);

            list.remove(list.size() - 1);
        }
    }
}
