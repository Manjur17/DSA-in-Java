package Patterns;
import java.util.Scanner;
public class BasicPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
