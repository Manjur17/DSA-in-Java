package BitManipulation;

public class ReverseBits {
    //The actual binary representation of the number is being considered
    // for reversing the bits, no leading 0’s are being considered.
    public int reverseBitsGFG(int n) {
        int result = 0;
        while (n != 0) {
            result = result << 1;
            result += (n & 1);
            n = n >> 1;
        }

        return result;
    }

    // you need treat n as an unsigned value
    //leading 0’s are being considered.
    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = ans << 1;
            ans += (n & 1);
            n = n >> 1;
        }
        return ans;
    }
}
