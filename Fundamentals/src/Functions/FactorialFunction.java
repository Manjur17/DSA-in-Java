package Functions;
import java.util.Scanner;
//Function declaration and definition
public class FactorialFunction {
    public static int factorial(int num){
        int fact = 1;
        for (int i=1; i <=num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=s.nextInt();
        System.out.println("Enter the value of R:");
        int r=s.nextInt();
        //Function Calling
        int factN= factorial(n);
        int factR= factorial(r);
        int factNR= factorial(n-r);
        int NcR = factN/(factR * factNR);
        System.out.println("The factorial of number is :  " + NcR);
    }
}
