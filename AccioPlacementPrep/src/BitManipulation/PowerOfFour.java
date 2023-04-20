package BitManipulation;

public class PowerOfFour {
    static boolean isPowerOfFourII(int n) {
        if (n <= 0) return false;
        //1 set bit as power of 4 is also power of 2
        //but set bit will only be at odd position -> use even mask
        //to set that bit unset
        return ((n & (n - 1)) == 0) && (n & 0xAAAAAAAA) == 0;
    }

    static boolean isPowerOfFourBrute(int n) {
        if (n <= 0) return false;
        while (n != 1) {
            if (n % 4 != 0) return false;
            n = n / 4;
        }
        return true;
    }

    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        int x = (int) (Math.log(n) / Math.log(4));
        return (n == (int) Math.pow(4, x));
    }
}
