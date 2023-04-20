package Maths;

import java.util.Scanner;

public class CheckPower {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean isPower = isPowerFunc(x, y);
        if (isPower) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static boolean isPowerFunc(int x, int y) {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);

        // Repeatedly compute power of x
        int pow = 1;
        while (pow < y)
            pow = pow * x;

        // Check if power of x becomes y
        return (pow == y);
    }
}
