package Recursion;

import java.util.Scanner;

public class FibonacciRecursion {
    public static int fibFunc(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fibFunc(n-2) + fibFunc(n-1);
    }
    //Approach 2 Memorisation
    public static int fibFunc1(int n,int[] arrF){
        if (n == 0 || n == 1){
            return n;
        }else {
            if (arrF[n-2] == 0){
                arrF[n-2] = fibFunc1(n-2,arrF);
            }
            if (arrF[n-1] == 0){
                arrF[n-1] = fibFunc1(n-1,arrF);
            }
        }
        return arrF[n-2] + arrF[n-1];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element you want to find :");
        int n = s.nextInt();
        int[] arrF = new int[n+1];
        System.out.println("The answer due to fibFunc is: " + fibFunc(n));
        System.out.println("The answer due to fibFunc1 is: " + fibFunc1(n,arrF));
    }
}
