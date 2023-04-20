package Fundamentals;
import java.util.Scanner;
public class ReturnKeyword{
    public static void main(String[] args) {
        int n;int div=2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=s.nextInt();
        while (div <= n/2)
        {
            if (n%div == 0)
            {
                System.out.println("The number is Composite");
                return;
            }
            div++;
        }
        System.out.println("The number is prime ");
    }

}