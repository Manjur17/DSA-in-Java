package OperatorsAndForLoop;
import java.util.Scanner;
public class AllPrimeNumbers {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        int div = 2;
        while (div < n/2){
            if (n%div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        System.out.println("The Prime numbers between 1 and N are: ");
        for (int i = 2;i<=n;i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
