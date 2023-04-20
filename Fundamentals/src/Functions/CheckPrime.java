package Functions;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int n){
        int div=2;
        boolean isPrime = true;
        while (div <= n / 2)  // as factors occurs in pair..... we can also take n-1
        {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        boolean isPrimeNumber= isPrime(n);
        System.out.println(isPrimeNumber);
    }
}
