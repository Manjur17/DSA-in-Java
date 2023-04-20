package Functions;
import java.util.Scanner;

public class FahrenheitToCelsiusTable{

    public static void fahrenheitToCelsiusTable(int s, int e,int w){
        System.out.println("Fahrenheit" + "\t " + "Celsius");
        while(s<=e){
            float c=(float) ((5.0/9) * (s-32) );
            System.out.println(s + "\t" + "\t" + "\t" + c);
            s += w;
        }
    }

    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        System.out.println("Enter the Start Fahrenheit Value:");
        int s=sh.nextInt();
        System.out.println("Enter the End Fahrenheit value:");
        int e=sh.nextInt();
        System.out.println("Enter the Step Size:");
        int w=sh.nextInt();
        fahrenheitToCelsiusTable(s,e,w);
    }
}
