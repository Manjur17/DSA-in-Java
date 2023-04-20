package Stack;

import java.util.Stack;

class StockSpannerStream {
    // SPAN ==> distance from the left greater element
    // previous greater element (left side)
    Stack<Pair> st;
    int day;

    public StockSpannerStream() {
        st = new Stack<>();
        day = 0;

    }

    // for holding the day and price in stack -> check the question stock span with array
    static class Pair {
        int day;
        int stockPrice;

        Pair(int day, int stockPrice) {
            this.day = day;
            this.stockPrice = stockPrice;
        }
    }

    public int next(int price) {

        while (!st.isEmpty() && price >= st.peek().stockPrice) {
            st.pop();

        }

        Pair pair = new Pair(day, price);

        int val = st.isEmpty() ? pair.day + 1 : pair.day - st.peek().day; //here day = i from stock span problem

        st.push(pair);
        day++;

        return val;

    }
}