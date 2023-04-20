package Patterns;
import java.util.Scanner;
public class BasicPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,i = 1;
        System.out.println("Enter the number:");
        n = s.nextInt();
        while (i <= n) {
            int j=1;
            while (j <= n) {
                System.out.print("*" + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
