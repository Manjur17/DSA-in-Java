package Fundamentals;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int n; int i=1;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        n=s.nextInt();
        System.out.println("The First N natural numbers are:");
        while (i <= n)
        {
            System.out.println(i);
            i++;
        }
    }
}
