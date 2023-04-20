package BitManipulation;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        //if n is power of 2
        //then there is 1 rmsb
        //so doing n & n-1 makes the rmsb becomes 0
        return (n & (n - 1)) == 0;
    }

    static boolean isPowerOfTwoBrute(int n) {
        if (n <= 0) return false;
        while (n != 1) {
            if (n % 2 != 0) return false;
            n = n / 2;
        }
        return true;
    }
}
