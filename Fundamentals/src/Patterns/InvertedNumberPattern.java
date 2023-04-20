package Patterns;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
    int n = s.nextInt();
    int i = 1;
        while (i <= n) {
        int numbers = 1;
        while (numbers <= (n - i + 1)) {
            System.out.print(n-i+1);
            numbers++;
        }
        System.out.println();
        i++;
    }
}
}
