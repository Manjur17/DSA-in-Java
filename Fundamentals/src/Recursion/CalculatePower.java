package Recursion;

import java.util.Scanner;

public class CalculatePower {
    public static int pow(int x,int n){
        if (n == 0){
            return 1;
        }
        if (n % 2 == 0) {
            return pow(x*x, n/2);
        }
        else {
            return x * pow(x*x,(n-1)/2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = s.nextInt();
        System.out.println("Enter the power to which the number is to be raised:");
        int n = s.nextInt();
        int ans = pow(x,n);
        System.out.println(ans);
    }
}
