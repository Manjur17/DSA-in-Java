package Functions;
import java.util.Scanner;
public class PowerOfANumber {
    public static int powerNumber(int n, int x){
        int number=1;
        for (int i=1; i<=x; i++){
            number *=n;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the power to which the number is to be raised:");
        int x=s.nextInt();
        int result = powerNumber(n,x);
        System.out.println(result);
    }
}
