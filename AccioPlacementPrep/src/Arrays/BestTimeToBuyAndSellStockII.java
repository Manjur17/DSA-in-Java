package Arrays;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStockII {
    //Greedy approach
    ArrayList<ArrayList<Integer>> stockBuySell(int[] A, int n) {
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();

        for (int i = 1; i < n; i++) {

            if (A[i] > A[i - 1]) {

                ArrayList<Integer> list = new ArrayList<>();
                list.add(i - 1);
                list.add(i);

                ansList.add(list);

            }

        }

        return ansList;
    }

    public int maxProfit(int[] prices) {
        int ans = 0, n = prices.length;
        for (int i = 1; i < n; i++) {

            if (prices[i] > prices[i - 1]) {

                ans += prices[i] - prices[i - 1];

            }

        }

        return ans;
    }
}
