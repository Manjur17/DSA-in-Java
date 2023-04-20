package Recursion;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countDigits(n));
    }

    private static int countDigits(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if (n == 0){
            return count;
        }
        int rem = n%10;
        if (rem == 0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
