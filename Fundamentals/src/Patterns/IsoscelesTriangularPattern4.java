package Patterns;
import java.util.Scanner;
public class IsoscelesTriangularPattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1, number=i;
            while (j <= i) {
                System.out.print(number);
                number++;
                j++;
            }
            int dec= (2*i-2);
            while (dec > 1)
            {
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
