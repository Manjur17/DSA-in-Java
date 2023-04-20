package Strings;

import java.util.Scanner;

public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            num.append(ch - 'a' + 1);
        }

        int ans = 0;

        while (k-- > 0) {
            int sum = 0;

            for (int i = 0; i < num.length(); i++) {
                char ch = num.charAt(i);
                sum += Integer.parseInt(ch + "");
            }

            num = new StringBuilder(String.valueOf(sum));
            ans = sum;

        }

        return ans;
    }
}
