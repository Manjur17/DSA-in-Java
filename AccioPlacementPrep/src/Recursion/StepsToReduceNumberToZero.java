package Recursion;

import java.util.Scanner;

public class StepsToReduceNumberToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }

    public static int numberOfSteps(int num) {
        return helper(num,0);
    }

    private static int helper(int num, int count) {
        if (num == 0){
            return count;
        }

        if (num % 2 == 0){
            return helper(num/2,count+1);
        }
        return helper(num-1,count+1);
    }
}
