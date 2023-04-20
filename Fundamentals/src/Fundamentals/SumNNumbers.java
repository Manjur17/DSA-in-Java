package Fundamentals;
import java.util.Scanner;
public class SumNNumbers {
    public static void main(String[] args) {
        int n,sum=0,i=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=s.nextInt();
        System.out.println("The First N natural numbers are:");
        while (i <= n)
        {
            System.out.print(i + "  ");
            sum=sum+i;
            i++;
        }
        System.out.println("\n" + "The Sum Of First N natural numbers is:" + sum);
    }
}
