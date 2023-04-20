package Recursion;

import java.util.Scanner;

public class MultiplicationRecursively {
    public static  int getMultiply(int m,int n){
        if (n == 0 || m == 0){
            return  0;
        }
        return m + getMultiply(m,n-1);
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the value of M:");
        int m = s.nextInt();
        System.out.println("Enter the value of N:");
        int n = s.nextInt();
        System.out.println("The multiplication of " + m + " * " + n + " is: " + getMultiply(m,n));
    }
}
