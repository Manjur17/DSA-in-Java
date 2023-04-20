package Recursion;

import java.util.Scanner;

public class DigitSumSuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder ans = new StringBuilder();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            ans.append(str);
        }
        System.out.println(digitSum(ans.toString()));
    }

    private static int digitSum(String str) {
        if (str.length() == 1) {
            return str.charAt(0) - '0';
        }
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        String temp = Integer.toString(sum);

        return digitSum(temp);
    }
}
