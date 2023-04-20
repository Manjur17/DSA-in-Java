package Functions;
import java.util.Scanner;

public class MemberOfFibonacci{
    public static boolean memberFibonacci(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int temp  = b;
            b = a+b;
            a = temp;
        }
        return b == n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n = s.nextInt();
        boolean result = memberFibonacci(n);
        System.out.println(result);

    }
}