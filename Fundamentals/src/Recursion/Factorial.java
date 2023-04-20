package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factFunc(int n){
        //Base Case
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factFunc(n-1);
    }
    public static int factFunc1(int n, int k){
        //Base Case
        if (n == 0 || n == 1){
            return k;
        }
        return factFunc1(n-1,k * n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int k = 1;
        System.out.println("The Factorial of " + n + " due to Non Tail Recursion function is: " + factFunc(n));
        System.out.println("The Factorial of " + n + " due to Equivalent Tail Recursion function is: " + factFunc1(n,k));
    }
}
