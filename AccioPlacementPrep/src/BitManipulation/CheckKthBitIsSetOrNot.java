package BitManipulation;

public class CheckKthBitIsSetOrNot {
    //k is 0 based
    static boolean checkKthBit(int n, int k) {
        // you need to treat n as an unsigned value
        // return ((n >> k) & 1) == 1;
       // return (n & (1 << k)) != 0;

        return ((n & (1 << k)) >> k ) == 1;
    }
}
