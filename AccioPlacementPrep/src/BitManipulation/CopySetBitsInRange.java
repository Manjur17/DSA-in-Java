package BitManipulation;

public class CopySetBitsInRange {
    static int setSetBit(int x, int y, int L, int R) {
        long mask = (1L << R - L + 1) - 1;
        mask = mask << L - 1;

        mask = mask & y;

        return  (int) (mask | x);
    }
}
