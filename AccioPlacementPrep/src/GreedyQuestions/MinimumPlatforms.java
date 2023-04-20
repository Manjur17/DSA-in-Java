package GreedyQuestions;

import java.util.Arrays;

public class MinimumPlatforms {
    static int findPlatform(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platNeeded = 1, result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                platNeeded++;
                i++;
            } else if (arr[i] > dep[j]) {
                platNeeded--;
                j++;
            }

            result = Math.max(result, platNeeded);
        }

        return result;
    }

    static int findPlatformBrute(int[] arr, int[] dep, int n) {
        int result = 1;

        // run a nested  loop to find overlap
        for (int i = 0; i < n; i++) {

            int platNeeded = 1; // minimum platform

            for (int j = 0; j < n; j++) {
                if (i != j)
                    // check for overlap
                    if (arr[i] >= arr[j] && dep[j] >= arr[i]) {
                        //arrival train arrives after previous train
                        //but the previous train has not departed
                        platNeeded++;
                    }
            }

            result = Math.max(result, platNeeded);
        }

        return result;
    }
}
