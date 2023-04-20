package GreedyQuestions;

public class MaximumSwap {
    public int maximumSwap(int num) {
        char[] number = String.valueOf(num).toCharArray();
        int n = number.length;

        int[] index = new int[n];
        int maxIdx = n - 1;
        index[maxIdx] = maxIdx;

        for (int i = n - 2; i >= 0; i--) {
            if (number[i] > number[maxIdx]) {
                maxIdx = i;
            }
            index[i] = maxIdx;
        }

        for (int i = 0; i < n; i++) {
            if (number[i] != number[index[i]]) {
                char temp = number[i];
                number[i] = number[index[i]];
                number[index[i]] = temp;
                break;
            }
        }


        return Integer.parseInt(String.valueOf(number));

    }
}
