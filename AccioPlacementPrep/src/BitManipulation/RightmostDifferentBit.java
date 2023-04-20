package BitManipulation;

public class RightmostDifferentBit {
    public static int posOfRightMostDiffBit(int m, int n) {
        if (m == n) {
            return -1;
        }

        int pos = 1;

        while (Math.max(m, n) > 0) {
            int bitM = m & 1;
            int bitN = n & 1;
            if (bitM != bitN) {
                return pos;
            }
            pos++;
            m = m >> 1;
            n = n >> 1;
        }


        return -1;
    }
}
