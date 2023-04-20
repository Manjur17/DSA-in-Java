package Recursion;

import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZeros(n, 0));
    }

    private static int countZeros(int N, int count) {
        if (N < 10) {
            return count;
        }
        if (N%10 == 0){
            count++;
        }
        return countZeros(N / 10, count);
    }
}
