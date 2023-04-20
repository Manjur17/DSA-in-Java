package BitManipulation;

import java.util.Scanner;

public class MagicNumber {
    public static int nthMagicalNumber(int n,int b) {
        int ans = 0;
        int digits = (int) (Math.log(n)/Math.log(b)) +1;
        System.out.println(digits);
        int base = 5;
        while (n >0){
            int last = n & 1;
            ans += last * base;
            base *= 5;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        System.out.println(nthMagicalNumber(n,b));
    }
}
