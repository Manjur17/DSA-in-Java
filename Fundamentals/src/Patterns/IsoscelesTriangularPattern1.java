package Patterns;

import java.util.Scanner;

public class IsoscelesTriangularPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= (n - i)) {
                System.out.print(" ");
                spaces++;
            }
            int numbers = 1;
            while (numbers <= i ) {
                System.out.print(numbers);
                numbers++;
            }
            int dec= i-1;
            while (dec >= 1)
            {
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
