package Recursion;

import java.util.Scanner;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static int helper(int n,int count){
        if(n == 0){
            return count;
        }

        if(n%2 == 0){
            return helper(n/2,count+1);
        }
        return helper(n-1,count+1);
    }
}
