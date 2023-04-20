package Recursion;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        int count = 1;
        System.out.println(count(str) + 1 );
    }

    private static int count(String str) {
        if (str.length() == 0) {
            return 0;
        }

        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            return 1 + count(str.substring(1));
        }
        return count(str.substring(1));
    }
}
