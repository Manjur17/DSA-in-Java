package GreedyQuestions;

import java.util.*;

public class MinimumNumberOfCoins {
    static List<Integer> minPartition(int n) {
        int[] arr = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        int total = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (n / arr[i] != 0) {

                int coins = n / arr[i];

                for (int j = 0; j < coins; j++) {
                    list.add(arr[i]);
                }

                total += coins;

                n = n - arr[i] * coins;
            }
        }

        return list;
    }
}
