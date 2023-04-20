package Recursion;

import java.util.Scanner;

public class SumOfDigitsRecursive {
    public static int sumOfDigits(int n){
        if (n < 10){
            return n;
        }
        return  (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = s.nextInt();
        System.out.println("The sum of the digits is: " + sumOfDigits(n));
    }
}
