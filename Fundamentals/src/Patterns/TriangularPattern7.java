package Patterns;
import java.util.Scanner;
public class TriangularPattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else  {
                    System.out.print(0 + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
