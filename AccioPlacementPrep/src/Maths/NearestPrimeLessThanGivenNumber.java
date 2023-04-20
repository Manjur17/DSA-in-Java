package Maths;

import java.util.Scanner;

public class NearestPrimeLessThanGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n--;
        while (n > 0){
            if (isPrime(n)){
                break;
            }
            n--;
        }
        System.out.println(n);
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
