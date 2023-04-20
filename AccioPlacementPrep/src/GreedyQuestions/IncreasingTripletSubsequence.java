package GreedyQuestions;

import java.util.HashMap;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < minOne) {
                minOne = num;
            }

            if (num > minOne && num < minTwo) {
                minTwo = num;
            }

            if (num > minTwo) {
                return true;
            }
        }
        return false;
    }

    public boolean increasingTripletBrute(int[] nums) {
        int a, b = 0;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > a) {
                    b = nums[j];

                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] > b) return true;
                    }
                }
            }
        }
        return false;
    }
}
