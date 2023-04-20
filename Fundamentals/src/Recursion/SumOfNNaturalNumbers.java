package Recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static int sumFunc(int n){
        //Base Condition
        if (n == 1){
            return 1;
        }
        return n + sumFunc(n-1);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int ans = sumFunc(n);
        System.out.println(ans);
    }
}
