package Fundamentals;
import  java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        int x,n,ans=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter The Number:");
        x=s.nextInt();
        System.out.println("Enter The Power To Which The number is to be raised:");
        n=s.nextInt();
        while (n > 0)
        {
            ans *= x;
            n--;
        }
        System.out.println(ans);

    }
}
