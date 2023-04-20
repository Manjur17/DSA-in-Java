package Maths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        int div = 2;
        while (div * div <= n){
            if(n % div == 0){
                isPrime = false;
                break;
            }
            div++;
        }
        return isPrime;
    }
}
