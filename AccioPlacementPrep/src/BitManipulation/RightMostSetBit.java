package BitManipulation;

import java.util.Scanner;

public class RightMostSetBit {
    public static int getFirstSetBit(int n) {
        int pos = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                return pos;
            }
            pos++;
            n = n >> 1;
        }
        return 0;
    }

    public static int getFirstSetBitII(int n) {
        if (n == 0) return 0;

        int rmsb = n & -n;
        int count = 1;
        String ans = Integer.toBinaryString(rmsb);
        for (int i = ans.length() - 1; i >= 0; i--) {
            if (ans.charAt(i) == '1')
                break;

            count++;
        }
        return count;
    }
}
