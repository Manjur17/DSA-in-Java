package Strings;

public class SumOfTwoLargeNumbers {
    String findSum(String X, String Y) {
        StringBuilder total = new StringBuilder();
        int i = X.length() - 1, j = Y.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = 0;
            int val1 = i >= 0 ? Integer.parseInt(X.charAt(i) + "") : 0;
            int val2 = j >= 0 ? Integer.parseInt(Y.charAt(j) + "") : 0;
            sum += carry + val1 + val2;
            carry = sum / 10;
            total.insert(0, sum % 10);
            i--;
            j--;
        }

        while (total.toString().startsWith("0")) {
            total.deleteCharAt(0);
        }
        return total.length() == 0 ? "0" : total.toString();
    }
}
