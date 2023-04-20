package Fundamentals;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        int n,div=2;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter The Number:");
        n=s.nextInt();
        while (div <= n/2)
        {
            if (n%div == 0)
            {
                System.out.print(div + " ");
            }
            div++;
        }
    }
}
