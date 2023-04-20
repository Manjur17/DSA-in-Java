package Maths;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int div = 2; div * div <= n; div++) {
            // if a number is non-prime, it will be divided by a number smaller than or equal to its square-root(or the closest integer value to it), and
            // if it cannot be divided, it can be said that the number is prime.
            if (n % div == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a Prime number");
        }else{
            System.out.println(n + " is not a Prime number");
        }
    }
}
