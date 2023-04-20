package Patterns;

import java.util.Scanner;

public class CharacterPattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int p=i;
            int j=1;
            while (j <= n) { char ch= (char)('A' + p -1);
                System.out.print( ch + " ");
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
