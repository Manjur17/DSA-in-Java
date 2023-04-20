package Recursion;

import java.util.Scanner;

public class GeometricSum {
    public static double sumFunc(int n){
        if (n == 0) {
            return 1;
        }
        return 1.0/Math.pow(2,n) + sumFunc(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        double ans = sumFunc(n);
        System.out.println(ans);
    }
}
