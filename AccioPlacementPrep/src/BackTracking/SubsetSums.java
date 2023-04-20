package BackTracking;

import java.util.*;

public class SubsetSums {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        System.out.println(subsetSums(arr, arr.size()));
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr, N, 0, ans, 0);
        Collections.sort(ans);
        return ans;
    }

    static private void helper(ArrayList<Integer> arr, int n, int ind, ArrayList<Integer> ans, int sum) {
        if (ind == n) {
            ans.add(sum);
            return;
        }

        helper(arr, n, ind + 1, ans, sum + arr.get(ind)); //pick it
        helper(arr, n, ind + 1, ans, sum); //not pick it
    }
}
