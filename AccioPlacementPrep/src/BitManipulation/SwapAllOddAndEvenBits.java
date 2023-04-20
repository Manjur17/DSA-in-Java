package BitManipulation;

public class SwapAllOddAndEvenBits {
    public static int swapBits(int n) {
        int oddMask = 0x55555555;
        int evenMask = 0xAAAAAAAA;

        int odds = (n & oddMask);
        int evens = (n & evenMask);

        odds <<= 1;
        evens >>= 1;

        return (odds | evens);
    }

    public static int swapBitsII(int n) {
        int res = 0;
        int i = 0;
        int j = 1;
        while (n != 0) {
            int a = n & 1;
            n >>= 1;
            int b = n & 1;
            n >>= 1;
            res = res | (a << j) | (b << i);
            i += 2;
            j += 2;
        }
        return res;
    }
}
