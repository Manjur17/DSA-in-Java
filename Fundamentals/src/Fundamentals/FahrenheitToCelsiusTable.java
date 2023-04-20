package Fundamentals;
import java.util.Scanner;
public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        int s,e,w;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the Start Fahrenheit Value:");
        s=sh.nextInt();
        System.out.println("Enter the End Fahrenheit Value");
        e=sh.nextInt();
        System.out.println("Enter the Step Size Value");
        w=sh.nextInt();
        System.out.println("Farhenheit"+ "    " + "Celsius");
        while (s>=0 && s<=e)
        {
            int c = (int) ((s-32) * (5.0/9));
            System.out.println(s+ "            " + c);
            s += w;
        }
    }

}

