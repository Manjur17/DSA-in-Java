package Maths;

import java.util.Scanner;

public class BSWithPrecisionSQRT {
    public static double bsWithPrecisionSQRT(int n,int p){
        int start = 0,end =n;
        double root = 0.0;
        //Finding the integral part of the root
        while (start <= end){
            int mid = start + (start - end)/2;
            if (mid * mid == n){
                root = mid;
                break;
            }else if (mid * mid > n){
                end = mid -1;
            }else {
                start = mid + 1;
                root = mid;
            }
        }
        //finding the root unto precision
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += increment;
            }
            root = root - increment;
            increment /= 10;
        }
        return (float)root;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        System.out.printf( "%3f" , bsWithPrecisionSQRT(n,p));
    }
}
