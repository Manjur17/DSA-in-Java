package Patterns;

import java.util.Scanner;

public class IsoscelesTriangularPattern3 {
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
            int stars = 1;
            while (stars <= (2*i - 1))    // Alternate to previous isosceles triangular pattern 2
            {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}
