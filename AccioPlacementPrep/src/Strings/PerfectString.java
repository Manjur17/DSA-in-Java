package Strings;

import java.util.Scanner;

public class PerfectString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }

        if (sum % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
