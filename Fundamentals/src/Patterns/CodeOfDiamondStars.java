package Patterns;
import java.util.Scanner;
public class CodeOfDiamondStars {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int firstHalf= (n+1)/2;
        int secondHalf= n/2;
        int i=1;
        //Printing First Half
        while (i <= firstHalf)
        {
            int spaces=1;
            while (spaces <= (firstHalf-i) )
            {
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while (stars <= 2*i-1)
            {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
        //Printing Second Half
        i = secondHalf;
        while (i >= 1)
        {
            int spaces =1;
            while (spaces <= (secondHalf-i+1))
            {
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while (stars <= 2*i-1)
            {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i--;
        }

    }
}
