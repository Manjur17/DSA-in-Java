package Patterns;

import java.util.Scanner;

public class CharacterPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j=1;
            char ch= (char)('A' + i -1);
            while (j <= i) {
                System.out.print( ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
