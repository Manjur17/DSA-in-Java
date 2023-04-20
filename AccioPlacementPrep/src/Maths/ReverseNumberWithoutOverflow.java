package Maths;

public class ReverseNumberWithoutOverflow {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            // make sure is not overflow
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && x % 10 > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && x % 10 < -8)) return 0;

            reverse = reverse * 10 + x % 10;  //4   -> 4*10 + 7  47  - > 47 *10 + 9  476
            x = x / 10;  // 967 - > 96  - > 9
        }
        return reverse;
    }
}
