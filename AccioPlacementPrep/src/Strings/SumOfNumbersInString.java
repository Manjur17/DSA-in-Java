package Strings;

import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(findSum(s));
    }

    public static long findSum(String str) {
        long res = 0;
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                StringBuilder ans = new StringBuilder();
                ans.append(str.charAt(i));
                while (j < str.length() && str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                    ans.append(str.charAt(j));
                    j++;
                }
                res += Integer.parseInt(ans.toString());
            }
            i = j - 1;
        }
        return res;
    }
}
