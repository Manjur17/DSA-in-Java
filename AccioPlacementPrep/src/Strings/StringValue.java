package Strings;

import java.util.Scanner;

public class StringValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    sum += 2;
                } else {
                    sum += 1;
                }
            } else {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    sum += 1;
                } else {
                    sum += 2;
                }
            }
        }
        System.out.println(sum);
    }
}
