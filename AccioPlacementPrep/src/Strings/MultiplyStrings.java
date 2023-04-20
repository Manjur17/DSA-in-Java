package Strings;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len = num1.length() + num2.length();
        int[] product = new int[len];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int idx = i + j + 1;
                int p = a * b + product[idx];
                product[idx] = p % 10;
                product[idx - 1] += p / 10;
            }
        }

        int start = product[0] != 0 ? 0 : 1;
        StringBuilder result = new StringBuilder();
        for (int i = start; i < len; i++) {
            result.append(product[i]);
        }
        return result.toString();
    }

    public String multiplyII(String num1, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        long ans = n1 * n2;
        return Long.toString(ans);
    }
}
