package Strings;

import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder adrian = new StringBuilder();
        adrian.append("ABC".repeat(33)).append("A");
        StringBuilder bruno = new StringBuilder();
        bruno.append("BABC".repeat(25));
        StringBuilder goran = new StringBuilder();
        goran.append("CCAABB".repeat(16)).append("CCAA");
        int n = sc.nextInt();
        String ans = sc.next();
        int a = 0, b = 0, g = 0;
        for (int i = 0; i < n; i++) {
            if (adrian.charAt(i) == ans.charAt(i)) {
                a++;
            }
            if (bruno.charAt(i) == ans.charAt(i)) {
                b++;
            }
            if (goran.charAt(i) == ans.charAt(i)) {
                g++;
            }
        }
        int max = Math.max(a, Math.max(b, g));
        System.out.println(max);
        if (a == max) {
            System.out.println("Adrian");
        }
        if (b == max) {
            System.out.println("Bruno");
        }
        if (g == max) {
            System.out.println("Goran");
        }
    }
}
