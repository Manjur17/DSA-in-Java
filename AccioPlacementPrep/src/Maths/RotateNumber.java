package Maths;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int noOfDigits = 0;
        while (temp > 0) {
            noOfDigits++;
            temp /= 10;
        }
        k = k % noOfDigits;

        if (k < 0) {
            k += noOfDigits;
        }

        int div = 1, mul = 1;
        for (int i = 0; i < noOfDigits; i++) {
            if (i < k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        int rem = n % div;
        int quo = n / div;
        int rotate = rem * mul + quo;
        System.out.println(rotate);
    }
}
