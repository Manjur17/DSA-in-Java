package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve0fEratosthenes {
    public static void sieveOfEratosthenes(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    //mark all multiples of i as false
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        sieveOfEratosthenes(n, primes);
    }
}


