package BitManipulation;

import java.util.Scanner;

public class FlippingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println((n ^ ((1L << 32) - 1))); //n ^ 1 = ~n
        }
    }
}
