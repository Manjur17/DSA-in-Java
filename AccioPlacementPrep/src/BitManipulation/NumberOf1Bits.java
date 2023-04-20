package BitManipulation;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            int rsb = n & -n;
            n -= rsb;
            count++;
        }

        return count;
    }

    public int hammingWeightII(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // by doing this the right most set bit becomes 0
            count++;
        }
        return count;
    }

    static int setBits(int n) {
        int cnt = 0;
        while (n != 0) {

            if ((n & 1) != 0)
                cnt++;

            n = n >> 1;
        }
        return cnt;
    }
}
