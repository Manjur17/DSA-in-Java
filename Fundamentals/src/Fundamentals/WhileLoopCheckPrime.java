package Fundamentals;

import java.util.Scanner;

public class WhileLoopCheckPrime {
    public static void main(String[] args) {
        int n;
        int div = 2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = s.nextInt();
        boolean isPrime = true;
        while (div <= n / 2)  // as factors occurs in pair..... we can also take n-1
        {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        if (isPrime) {
            System.out.println("The number is prime ");
        } else {
            System.out.println("The number is composite ");
        }
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}