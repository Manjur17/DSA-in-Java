package Maths;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int countDigits = 0;
        while (temp > 0) {
            countDigits++;
            temp /= 10;
        }

        int div = (int) Math.pow(10, countDigits - 1);
        while (div > 0) {
            int ans = n / div;
            System.out.println(ans);
            n = n % div;
            div = div / 10;
        }
    }
}
