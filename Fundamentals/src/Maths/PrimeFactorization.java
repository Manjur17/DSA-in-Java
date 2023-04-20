package Maths;

import java.util.Scanner;

public class PrimeFactorization {
    public static void primeFunc(int n){
        System.out.println("The prime factors obtained from function are: ");
        for (int div=2; div * div  <= n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        } //not running the loop beyond p*p(here p=div)
            if(n != 1){
                System.out.println(n);
            }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int x=n;
        int digit = 2;
        System.out.println("The prime factors obtained from main are: ");
        while (n > 1) {
                    while (n % digit == 0) {
                        n = n / digit;
                        System.out.print(digit + " ");
                   }
                digit++;
        }
        System.out.println();
        primeFunc(x);
    }
}
