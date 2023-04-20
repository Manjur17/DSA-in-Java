package BitManipulation;

public class CountTotalSetBits12N {
    private static int powerOf2(int n) {
        int i = 0;
        while ((1 << i) <= n) {
            i++;
        }
        return i - 1;
    }

    public static int countSetBits(int n) {
        if (n == 0)
            return 0;
        int x = powerOf2(n);//nearest lesser power of n
        int bits1 = x * (1 << (x - 1)); // 2^x-1 * x
        int bits2 = n - (1 << x) + 1; // n - 2^x +1
        int rest = n - (1 << x); //n - 2^x
        return bits1 + bits2 + countSetBits(rest);
    }

    public static int countSetBitsBrute(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                temp = temp & (temp - 1); // by doing this the right most set bit becomes 0
                count++;
            }
        }
        return count;
    }

}
