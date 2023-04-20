package Strings;

import java.util.Scanner;

public class StrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            if (ch > 'z') {
                ch = 'a';
            }
            if (i % 2 == 0) {
                ans.insert(0, ch);
            } else {
                ans.append(ch);
            }
            ch++;
        }
        System.out.println(ans);
    }
}