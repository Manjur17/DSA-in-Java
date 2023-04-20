package Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0, minVal = prices[0];

        for (int i = 1; i < n; i++) {
            if (minVal > prices[i]) {
                minVal = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minVal);
            }
        }

        return profit;
    }
}
