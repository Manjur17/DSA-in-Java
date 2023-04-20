package Patterns;

import java.util.Scanner;

public class TriangularPattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j=i;
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
