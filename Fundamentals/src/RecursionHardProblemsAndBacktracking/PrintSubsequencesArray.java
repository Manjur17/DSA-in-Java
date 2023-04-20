package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequencesArray {
    public static void printSubsequences(int idx, int[] arr, List<Integer> list, int n) {
        if (idx == n) {
            //print the subset and return
            System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        printSubsequences(idx + 1, arr, list, n);
        list.remove(list.size() - 1);
        printSubsequences(idx + 1, arr, list, n);
        //other around
        /*
        printSubsequences(arr, index + 1, list); Subsequence without including the element at current index
        list.add(arr[index]);

        printSubsequences(arr, index + 1, list); // Subsequence including the element at current index

        list.remove(list.size() - 1);  // Backtrack to remove the recently inserted element
        */
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // Auxiliary space to store each path
        List<Integer> path = new ArrayList<>();

        printSubsequences(0, arr, path, arr.length);
    }
}
