package BitManipulation;

public class DivideTwoIntegers {
    public int divide(int a, int b) {
        int sign = 1;
        if ((a < 0 && b > 0) || (a > 0 && b < 0))
            sign = -1;

        int x = 0, ans = 0;
        a = Math.abs(a);
        b = Math.abs(b);


        while ((a - b) >= 0) {

            while (a - (b << x) >= 0) {
                x++;
            }

            x--;
            ans += (1 << (x));
            a -= b << x;
            x = 0;
        }

        return sign * ans;
    }
}
