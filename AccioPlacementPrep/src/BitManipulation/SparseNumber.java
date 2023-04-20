package BitManipulation;

public class SparseNumber {
    public static boolean isSparse(int n) {
        while (n != 0) {
            if (((n & 1) == 1)) {
                n = n >> 1;
                if (((n & 1) == 1)) return false;
            } else {
                n = n >> 1;
            }
        }

        return true;
    }

    public static boolean isSparseII(int n) {
        // n is not sparse if there is set bit in AND of n and n/2
        return ((n & (n >> 1)) == 0);
    }
}
