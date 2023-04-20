package Maths;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i*i < n; i++) {
            while (n % i == 0){
                System.out.println(i);
                n /= i;
            }
        }
        if (n != 0){
            System.out.println(n);
        }
    }
}
