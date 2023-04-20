package RSL;

import java.util.ArrayList;

public class StockBuyAndSell {
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
}
