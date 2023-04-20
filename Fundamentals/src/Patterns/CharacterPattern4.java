package Patterns;

import java.util.Scanner;

public class CharacterPattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            char p= (char)('A' + i -1);  // Alternate to CharacterPattern3
            int j=1;
            while (j <= n) {
                System.out.print( p + " ");
                p=(char)(p+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
