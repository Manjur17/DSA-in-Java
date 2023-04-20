package BitManipulation;

public class BitDifference {
    public int minBitFlips(int m, int n) {
        //XOR toggles the bits and will form a number that will have
        //set bits at the places where the numbers bits differ in m and n
        //eg: 010 ^ 111 = 101...diff of bits = count of 1's = 2
        int xor = m ^ n;
        return countSetBits(xor);
    }

    //Kernighan algo
    static int countSetBits(int n) {
        int count = 0;            // `count` stores the total bits set in `n`

        while (n != 0) {
            n = n & (n - 1);    // clear the least significant bit set
            count++;
        }

        return count;
    }

    public static int countBitsFlip(int m, int n) {
        int count = 0;
        while (Math.max(m, n) > 0) {
            int bitM = m & 1;
            int bitN = n & 1;
            if (bitM != bitN) {
                count++;
            }

            m = m >> 1;
            n = n >> 1;
        }

        return count;
    }
}
