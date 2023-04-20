package Functions;
import java.util.Scanner;
public class CalculateNcR {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=s.nextInt();
        System.out.println("Enter the value of R:");
        int r=s.nextInt();
        //Factorial of N
        int factN=1;
        for (int i=1;i <= n; i++) {
            factN = factN * i;
        }
        //Factorial of R
        int factR=1;
        for (int i=1;i <= r; i++) {
            factR = factR * i;
        }
        //Factorial of NcR
        int factNR=1;
        for (int i=1;i <= n-r; i++) {
            factNR = factNR * i;
        }
        int result= factN/(factR * factNR);
        System.out.println(result);
    }
}
