package BitManipulation;

public class BinaryToDecimal {
    public int binary_to_decimal(String s) {
        int n = s.length();
        int res = 0, j = 0;

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int curr = Integer.parseInt(ch + "");
            res += curr * (1 << j);
            j++;
        }

        return res;
    }
}
